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

package com.liferay.zain.practice.service;

import com.liferay.zain.practice.model.normal;

/**
 * Provides the remote service utility for normal. This utility wraps
 * <code>com.liferay.zain.practice.service.impl.normalServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see normalService
 * @generated
 */
public class normalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.zain.practice.service.impl.normalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static normal createZainForm1(
		String name, String catalog, String governorate, String areazone) {

		return getService().createZainForm1(
			name, catalog, governorate, areazone);
	}

	public static int getbyNameDynamicQuery1(String name) {
		return getService().getbyNameDynamicQuery1(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static normalService getService() {
		return _service;
	}

	private static volatile normalService _service;

}