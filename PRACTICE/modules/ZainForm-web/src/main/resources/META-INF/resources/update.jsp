<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.zain.service.CityLocalServiceUtil"  %>
<%@ page import="com.liferay.training.zain.states.service.StatessLocalServiceUtil"  %>

<portlet:resourceURL id="/user/detail/update" var="updateformurl" >
</portlet:resourceURL>

<h1>Hello from UPDATE.JSP</h1>
<%
    String name = renderRequest.getParameter("name");
    String catalog = renderRequest.getParameter("catalog");
    String governorate = renderRequest.getParameter("governorate");
    String areazone = renderRequest.getParameter("areazone");
    String sampleid = renderRequest.getParameter("sampleid");

%>

<h1><%=sampleid %></h1>

<portlet:actionURL name="UpdateForm" var="UpdateForm">
<portlet:param name="sampleId" value="<%=sampleid%>"/>
</portlet:actionURL>

<aui:form action="<%= UpdateForm %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		
		<aui:input name="Name" value="<%=name%>">
		<aui:validator name="required" />
		</aui:input>
		
		<aui:input name="Catalog" value="<%=catalog%>">
		<aui:validator name="required" />
		</aui:input>
		
		<aui:select  name="Goveronorate" onChange="getOption('${updateformurl}',this.value)" value="<%=governorate%>">
		<aui:option >Select a State</aui:option>
		<% for(int i=1;i<=StatessLocalServiceUtil.getStatessesCount();i++) { %>
		<aui:option id="<%=StatessLocalServiceUtil.getStatess(i).getId() %>" value="<%=StatessLocalServiceUtil.getStatess(i).getName() %>"><%=StatessLocalServiceUtil.getStatess(i).getName() %></aui:option>
		<%} %>
		<aui:validator name="required" />
		</aui:select>
		
		<aui:select name="AreaZone" id="areazoneId" value="<%=name%>">
		<aui:validator name="required" />
		</aui:select>
	
	</aui:fieldset>
	
	<aui:button-row>
	<aui:button type="submit" value="Submit" />
	</aui:button-row>
</aui:form>


<script>
getOption('${updateformurl}','<%=governorate%>')
	function getOption(downloadUrl,statename) {
		var stateid =$('#_com_liferay_zain_practice_web_ZainFormWebPortlet_INSTANCE_zNBJGAGOo9MI_Goveronorate').find('option[value="'+ statename +'"]').attr('id')
		const formData = new FormData();
		formData.append("<portlet:namespace/>selection",stateid);
		$.ajax({
			url : downloadUrl,
			processData : false,
			contentType : false,
			data: formData,
			type : 'POST',
			success : function(data) {
				const myObj = JSON.parse(data);
				var selectTest = document.getElementById("<portlet:namespace />areazoneId");
				selectTest.options.length = 0;
				for (var i = 0; i<myObj.cities.length; i++) {
					option = document.createElement("option");
					option.value = myObj.cities[i].city
					option.text = myObj.cities[i].city
					selectTest.appendChild(option);
				}
				document.getElementById("<portlet:namespace />areazoneId").value='<%=areazone%>';
			},
			error : function(jqxhr, status, exception) {
				console.log("hello frome failure");
			}
		});
	}
</script>

