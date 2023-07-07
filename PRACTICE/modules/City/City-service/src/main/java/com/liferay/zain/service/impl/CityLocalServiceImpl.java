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

package com.liferay.zain.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.zain.model.City;
import com.liferay.zain.service.CityLocalService;
import com.liferay.zain.service.CityLocalServiceUtil;
import com.liferay.zain.service.base.CityLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.zain.model.City",
	service = AopService.class
)
public class CityLocalServiceImpl extends CityLocalServiceBaseImpl {
	public List<City> getCityByStateId(int stateId){
		ClassLoader classLoader = getClass().getClassLoader();
		DynamicQuery dq = CityLocalServiceUtil.dynamicQuery();
		dq.add(RestrictionsFactoryUtil.eq("state_id", stateId));
		return CityLocalServiceUtil.dynamicQuery(dq);
		}
}