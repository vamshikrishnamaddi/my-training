<%@ include file="/init.jsp" %>
<h1>Hello From Second.jsp</h1>

<portlet:renderURL var="renderJSPVariable1">
<portlet:param name="jspPage" value="/view.jsp"/>
</portlet:renderURL>



        
<a href="${renderJSPVariable1}">Go Back</a>
<table class="table table-striped">
    <tr >
        <th>Name</th>
        <th>Catalog</th>
        <th>Governorate</th>
        <th>areazone</th>
        <th colspan="2" style="width: 300px;text-align: center">Action</th>
    </tr>
    <c:forEach items="${studentList}" var="student">  
    
    <portlet:actionURL name="deleteForm" var="deleteFormActionURL">
	<portlet:param name="sampleId" value="${student.getSampleId()}"/>
	</portlet:actionURL>
	
	<portlet:resourceURL var="deleteFormActionURL1">
    <portlet:param name="sampleId" value="${student.getSampleId()}"/>
	</portlet:resourceURL>
	
	<portlet:renderURL var="updateForRenderURL">
	<portlet:param name="jspPage" value="/META-INF/resources/update.jsp"/>
    <portlet:param name="name" value="${student.getName()}"/>
    <portlet:param name="catalog" value="${student.getCatalog()}"/>
    <portlet:param name="governorate" value="${student.getGovernorate()}"/>
    <portlet:param name="areazone" value="${student.getAreazone()}"/>
    <portlet:param name="sampleid" value="${student.getSampleId()}"/>
	</portlet:renderURL>
           <tr>    
            <td>${student.getName()}</td>
            <td>${student.getCatalog()}</td>
            <td>${student.getGovernorate()}</td>
            <td>${student.getAreazone()}</td>
            <td class="text-center" style="width: 50px">
            <aui:button-row>
                <aui:button type="submit" value="UPDATE" onClick="<%=updateForRenderURL%>"/>   
            	<aui:button type="submit" value="DELETE" onClick="<%=deleteFormActionURL%>" />
                </aui:button-row>
            </td>
            </tr>
    </c:forEach>
    

</table>