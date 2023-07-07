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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.zain.states.model.Statess;
import com.liferay.training.zain.states.service.StatessLocalServiceUtil;
import com.liferay.zain.practice.model.normal;
import com.liferay.zain.practice.service.normalLocalServiceUtil;
import com.liferay.zain.practice.service.base.normalLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.zain.practice.model.normal",
	service = AopService.class
)
public class normalLocalServiceImpl extends normalLocalServiceBaseImpl {
	public normal createZainForm(String name, String catalog, String governorate, String areazone) {
		normal obj = normalLocalService.createnormal(System.currentTimeMillis());
		obj.setName(name);
		obj.setCatalog(catalog);
		obj.setGovernorate(governorate);
		obj.setAreazone(areazone);
		normalLocalService.addnormal(obj);
		return obj;
	}
	public normal deleteZainForm(long id) throws PortalException
	{
		return normalLocalService.deletenormal(id);
	}
	public normal updateZainForm(long id,String name, String catalog, String governorate, String areazone)
	{
		normal obj = normalLocalService.fetchnormal(id);
		obj.setName(name);
		obj.setCatalog(catalog);
		obj.setGovernorate(governorate);
		obj.setAreazone(areazone);
		normalLocalService.updatenormal(obj);
		return obj;
	}
	public int getbyNameDynamicQuery(String name)
	{
		ClassLoader classLoader = getClass().getClassLoader();
		DynamicQuery dq = DynamicQueryFactoryUtil.forClass(normal.class, classLoader);
	//	dq.add(RestrictionsFactoryUtil.eq("name", name));
		List<Statess>li= StatessLocalServiceUtil.dynamicQuery(dq.add(RestrictionsFactoryUtil.eq("name", name)));
		System.out.println("Error============================");
		System.out.println(li);
		System.out.println(li.get(0).getId());
		return li.get(0).getId();
//		try {
//		
//			ClassLoader classLoader = getClass().getClassLoader();
//			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(normal.class, classLoader);
//		//	dq.add(RestrictionsFactoryUtil.eq("name", name));
//			List<Statess>li= StatessLocalServiceUtil.dynamicQuery(dq.add(RestrictionsFactoryUtil.eq("name", name)));
//			System.out.println(li.get(0).getId());
//			return li.get(0).getId();
//		} catch (Exception e) {
//			System.out.println("Error============================");
//			//e.printStackTrace();
//		}
//		return 10;
	}
}