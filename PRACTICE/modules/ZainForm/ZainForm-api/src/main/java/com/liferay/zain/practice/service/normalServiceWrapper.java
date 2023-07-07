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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link normalService}.
 *
 * @author Brian Wing Shun Chan
 * @see normalService
 * @generated
 */
public class normalServiceWrapper
	implements normalService, ServiceWrapper<normalService> {

	public normalServiceWrapper(normalService normalService) {
		_normalService = normalService;
	}

	@Override
	public com.liferay.zain.practice.model.normal createZainForm1(
		String name, String catalog, String governorate, String areazone) {

		return _normalService.createZainForm1(
			name, catalog, governorate, areazone);
	}

	@Override
	public int getbyNameDynamicQuery1(String name) {
		return _normalService.getbyNameDynamicQuery1(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _normalService.getOSGiServiceIdentifier();
	}

	@Override
	public normalService getWrappedService() {
		return _normalService;
	}

	@Override
	public void setWrappedService(normalService normalService) {
		_normalService = normalService;
	}

	private normalService _normalService;

}