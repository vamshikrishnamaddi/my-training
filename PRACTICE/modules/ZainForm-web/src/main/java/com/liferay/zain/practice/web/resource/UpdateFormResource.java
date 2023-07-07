//package com.liferay.zain.practice.web.resource;
//
//
//
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
//import com.liferay.zain.practice.web.constants.ZainFormWebPortletKeys;
//
//import javax.portlet.PortletException;
//import javax.portlet.ResourceRequest;
//import javax.portlet.ResourceResponse;
//
//import org.osgi.service.component.annotations.Component;
//@Component(
//		immediate = true,
//		property = {
//				"com.liferay.portlet.display-category=category.sample",
//				"com.liferay.portlet.header-portlet-css=/css/main.css",
//				"com.liferay.portlet.instanceable=true",
//				"javax.portlet.display-name=ZainFormWeb",
//				"javax.portlet.init-param.template-path=/",
//				"javax.portlet.init-param.view-template=/view.jsp",
//				"javax.portlet.name=" + ZainFormWebPortletKeys.ZAINFORMWEB,
//				"javax.portlet.resource-bundle=content.Language",
//				"javax.portlet.security-role-ref=power-user,user",
//				"mvc.command.name=/login/captcha"
//		},
//		service = MVCResourceCommand.class
//	)
//public class UpdateFormResource implements MVCResourceCommand{
//	@Override
//	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
//			throws PortletException {
//		System.out.println("=========>UpdateFormResource");
//
//		return false;
//		
//	}
//
//}



package com.liferay.zain.practice.web.resource;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.zain.model.City;
import com.liferay.zain.practice.model.normal;
import com.liferay.zain.practice.service.normalLocalServiceUtil;
import com.liferay.zain.practice.web.constants.ZainFormWebPortletKeys;
import com.liferay.zain.service.CityLocalServiceUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
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
				"javax.portlet.security-role-ref=power-user,user",
				"mvc.command.name=/hello/world"
		},
		service = MVCResourceCommand.class
	)

public class UpdateFormResource implements MVCResourceCommand {


	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("=========>UpdateFormResource");
//        int stateId = ParamUtil.getInteger(resourceRequest, "selection");
//        System.out.println(stateId);
//        List<City> cities = CityLocalServiceUtil.getCityByStateId(stateId);
//        resourceRequest.setAttribute("cities", cities);  
////        super.serveResource(resourceRequest, resourceResponse);
////        System.out.println(cities.size());
//        JSONObject jsonobj =  JSONFactoryUtil.createJSONObject();
//        jsonobj.put("dataReceivedMessage","Data Received Successfully");
//        jsonobj.put("cities", cities);
//        PrintWriter printout;
//		try {
//			printout = resourceResponse.getWriter();
//			printout.print(jsonobj);   
//			System.out.println("=========>Successjsonobj");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("=========>Failedjsonobj");
//		}
//        
		return false;
	}

}
