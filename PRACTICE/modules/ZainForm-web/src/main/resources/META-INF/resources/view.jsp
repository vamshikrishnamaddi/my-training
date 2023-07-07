<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.zain.practice.service.normalLocalServiceUtil"  %>
<%@ page import="com.liferay.zain.service.CityLocalServiceUtil"  %>
<%@ page import="com.liferay.training.zain.states.service.StatessLocalServiceUtil"  %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"  %>

<portlet:resourceURL id="/user/detail" var="userDetailUrl">
</portlet:resourceURL>

<p>
	<b><liferay-ui:message key="zainformweb.caption"/></b>
</p>
<h1>Hello Zain Team</h1>
<portlet:renderURL var="renderJSPVariable">
<portlet:param name="jspPage" value="/META-INF/resources/second.jsp"/>
</portlet:renderURL>
<portlet:actionURL name="submitForm" var="submitForm" />
<h4>Fill The Form</h4>
<p id="demo"></p>


<aui:form action="<%= submitForm %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input name="Name" >
		<aui:validator name="required" />
		</aui:input>
		<aui:input name="Catalog" >
		<aui:validator name="required" />
		</aui:input>
		<aui:select  name="Goveronorate" onChange="getOption(event,'${userDetailUrl}',this.value)" >
		<aui:option >Select a State</aui:option>
		<% for(int i=1;i<=StatessLocalServiceUtil.getStatessesCount();i++) { %>
		<aui:option id="<%=StatessLocalServiceUtil.getStatess(i).getId() %>" value="<%=StatessLocalServiceUtil.getStatess(i).getName() %>"><%=StatessLocalServiceUtil.getStatess(i).getName() %></aui:option>
		<%} %>
		<aui:validator name="required" />
		</aui:select> 
		<aui:select name="AreaZone" id="areazoneId">
		<aui:validator name="required" />
		</aui:select>
	</aui:fieldset>
	
	<aui:button-row>
	<aui:button type="submit" value="Submit" />
	<aui:button type="submit" value="Show Data" onClick="<%=renderJSPVariable%>" />
	</aui:button-row>
</aui:form>



<script>
	function getOption(e, downloadUrl,statename) {
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
			},
			error : function(jqxhr, status, exception) {
				console.log("hello frome failure");
			}
		});
	}
	
</script>
