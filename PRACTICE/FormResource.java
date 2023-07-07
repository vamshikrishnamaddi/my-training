package com.liferay.zain.practice.web.resource;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.zain.practice.web.constants.ZainFormWebPortletKeys;

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
				"mvc.command.name=/user/detail"
		},
		service = MVCResourceCommand.class
	)

public class FormResource implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
//			throws PortletException {
//		System.out.println("=========>FormResource");
//        String operators = ParamUtil.getString(resourceRequest, "a");
//        
//		System.out.println(operators);
//	
//		return false;
	}

}
