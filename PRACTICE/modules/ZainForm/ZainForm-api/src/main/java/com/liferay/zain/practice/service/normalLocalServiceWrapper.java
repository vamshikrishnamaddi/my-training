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
 * Provides a wrapper for {@link normalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see normalLocalService
 * @generated
 */
public class normalLocalServiceWrapper
	implements normalLocalService, ServiceWrapper<normalLocalService> {

	public normalLocalServiceWrapper(normalLocalService normalLocalService) {
		_normalLocalService = normalLocalService;
	}

	/**
	 * Adds the normal to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect normalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param normal the normal
	 * @return the normal that was added
	 */
	@Override
	public com.liferay.zain.practice.model.normal addnormal(
		com.liferay.zain.practice.model.normal normal) {

		return _normalLocalService.addnormal(normal);
	}

	/**
	 * Creates a new normal with the primary key. Does not add the normal to the database.
	 *
	 * @param sampleId the primary key for the new normal
	 * @return the new normal
	 */
	@Override
	public com.liferay.zain.practice.model.normal createnormal(long sampleId) {
		return _normalLocalService.createnormal(sampleId);
	}

	@Override
	public com.liferay.zain.practice.model.normal createZainForm(
		String name, String catalog, String governorate, String areazone) {

		return _normalLocalService.createZainForm(
			name, catalog, governorate, areazone);
	}

	/**
	 * Deletes the normal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect normalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal that was removed
	 * @throws PortalException if a normal with the primary key could not be found
	 */
	@Override
	public com.liferay.zain.practice.model.normal deletenormal(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _normalLocalService.deletenormal(sampleId);
	}

	/**
	 * Deletes the normal from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect normalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param normal the normal
	 * @return the normal that was removed
	 */
	@Override
	public com.liferay.zain.practice.model.normal deletenormal(
		com.liferay.zain.practice.model.normal normal) {

		return _normalLocalService.deletenormal(normal);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _normalLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.zain.practice.model.normal deleteZainForm(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _normalLocalService.deleteZainForm(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _normalLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _normalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.zain.practice.model.impl.normalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _normalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.zain.practice.model.impl.normalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _normalLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _normalLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _normalLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.zain.practice.model.normal fetchnormal(long sampleId) {
		return _normalLocalService.fetchnormal(sampleId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _normalLocalService.getActionableDynamicQuery();
	}

	@Override
	public int getbyNameDynamicQuery(String name) {
		return _normalLocalService.getbyNameDynamicQuery(name);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _normalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the normal with the primary key.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal
	 * @throws PortalException if a normal with the primary key could not be found
	 */
	@Override
	public com.liferay.zain.practice.model.normal getnormal(long sampleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _normalLocalService.getnormal(sampleId);
	}

	/**
	 * Returns a range of all the normals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.zain.practice.model.impl.normalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @return the range of normals
	 */
	@Override
	public java.util.List<com.liferay.zain.practice.model.normal> getnormals(
		int start, int end) {

		return _normalLocalService.getnormals(start, end);
	}

	/**
	 * Returns the number of normals.
	 *
	 * @return the number of normals
	 */
	@Override
	public int getnormalsCount() {
		return _normalLocalService.getnormalsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _normalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _normalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the normal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect normalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param normal the normal
	 * @return the normal that was updated
	 */
	@Override
	public com.liferay.zain.practice.model.normal updatenormal(
		com.liferay.zain.practice.model.normal normal) {

		return _normalLocalService.updatenormal(normal);
	}

	@Override
	public com.liferay.zain.practice.model.normal updateZainForm(
		long id, String name, String catalog, String governorate,
		String areazone) {

		return _normalLocalService.updateZainForm(
			id, name, catalog, governorate, areazone);
	}

	@Override
	public normalLocalService getWrappedService() {
		return _normalLocalService;
	}

	@Override
	public void setWrappedService(normalLocalService normalLocalService) {
		_normalLocalService = normalLocalService;
	}

	private normalLocalService _normalLocalService;

}