/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.zain.practice.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.zain.practice.model.normal;
import com.liferay.zain.practice.service.normalLocalServiceUtil;
import com.liferay.zain.practice.service.base.normalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=zain",
		"json.web.service.context.path=normal"
	},
	service = AopService.class
)
public class normalServiceImpl extends normalServiceBaseImpl {
	public normal createZainForm1(String name, String catalog, String governorate, String areazone) 
	{
		return normalLocalServiceUtil.createZainForm(name,catalog,governorate,areazone);
	}
	public int getbyNameDynamicQuery1(String name)
	{
		return normalLocalServiceUtil.getbyNameDynamicQuery(name);
	}
}