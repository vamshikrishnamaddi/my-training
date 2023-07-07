package com.liferay.zain.practice.web.portlet;

import com.liferay.zain.model.City;
import com.liferay.zain.practice.model.normal;
import com.liferay.zain.practice.service.normalLocalServiceUtil;
import com.liferay.zain.practice.web.constants.ZainFormWebPortletKeys;
import com.liferay.zain.service.CityLocalServiceUtil;

import java.io.PrintWriter;
import java.util.List;

import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.zain.states.service.StatessLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ZainFormWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ZainFormWebPortletKeys.ZAINFORMWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ZainFormWebPortlet extends MVCPortlet {
	public normal submitForm(ActionRequest request,ActionResponse responce) throws PortalException
	{
		String Name=ParamUtil.getString(request,"Name");
		String Catalog=ParamUtil.getString(request,"Catalog");
		String Goveronorate=ParamUtil.getString(request,"Goveronorate");
		String AreaZone=ParamUtil.getString(request,"AreaZone");
		return normalLocalServiceUtil.createZainForm(Name, Catalog, Goveronorate, AreaZone);
	}
	@Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws java.io.IOException, PortletException{
		List<normal> studentList = normalLocalServiceUtil.getnormals(0,normalLocalServiceUtil.getnormalsCount());
//		System.out.println("=======>Render Method");
        renderRequest.setAttribute("studentList", studentList);        
        super.render(renderRequest, renderResponse);
    }
	public normal deleteForm(ActionRequest request,ActionResponse responce) throws PortalException
	{
//		System.out.println("=======>Action Method deleteForm");
		long sampleId = ParamUtil.getLong(request, "sampleId");
//		System.out.println("=======>"+sampleId);
		return normalLocalServiceUtil.deleteZainForm(sampleId);
	}
	public normal UpdateForm(ActionRequest request,ActionResponse responce)
	{
		String Name=ParamUtil.getString(request,"Name");
		String Catalog=ParamUtil.getString(request,"Catalog");
		String Goveronorate=ParamUtil.getString(request,"Goveronorate");
		String AreaZone=ParamUtil.getString(request,"AreaZone");
		long sampleid = ParamUtil.getLong(request, "sampleId");
//		System.out.println("=======>Action Method UpdateForm");
		return normalLocalServiceUtil.updateZainForm(sampleid, Name, Catalog, Goveronorate, AreaZone);
	}
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws java.io.IOException
	{
//		System.out.println("=======>serveResourceFromPortlet");
		String resourceId = resourceRequest.getResourceID();
		if(resourceId.equals("/user/detail"))
		{
	        int stateId = ParamUtil.getInteger(resourceRequest, "selection");
	        List<City> cities = CityLocalServiceUtil.getCityByStateId(stateId);
	        resourceRequest.setAttribute("cities", cities);  
	        JSONObject jsonobj =  JSONFactoryUtil.createJSONObject();
	        jsonobj.put("dataReceivedMessage","Data Received Successfully");
	        jsonobj.put("cities", cities);
	        PrintWriter printout;
			try {
				printout = resourceResponse.getWriter();
				printout.print(jsonobj);   
//				System.out.println("=========>Successjsonobj");
			} catch (IOException e) {
				System.out.println("=========>Failedjsonobj");
			}
		}
		else if(resourceId.equals("/user/detail/update"))
		{
			int stateId = ParamUtil.getInteger(resourceRequest, "selection");
	        List<City> cities = CityLocalServiceUtil.getCityByStateId(stateId);
	        resourceRequest.setAttribute("cities", cities);  
	        JSONObject jsonobj =  JSONFactoryUtil.createJSONObject();
	        jsonobj.put("dataReceivedMessage","Data Received Successfully");
	        jsonobj.put("cities", cities);
	        PrintWriter printout;
			try {
				printout = resourceResponse.getWriter();
				printout.print(jsonobj);   
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("=========>Failedjsonobj");
			}
		}
	}
}