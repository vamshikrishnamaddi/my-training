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

package com.liferay.training.zain.states.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StatessLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StatessLocalService
 * @generated
 */
public class StatessLocalServiceWrapper
	implements ServiceWrapper<StatessLocalService>, StatessLocalService {

	public StatessLocalServiceWrapper(StatessLocalService statessLocalService) {
		_statessLocalService = statessLocalService;
	}

	/**
	 * Adds the statess to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statess the statess
	 * @return the statess that was added
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess addStatess(
		com.liferay.training.zain.states.model.Statess statess) {

		return _statessLocalService.addStatess(statess);
	}

	/**
	 * Creates a new statess with the primary key. Does not add the statess to the database.
	 *
	 * @param id the primary key for the new statess
	 * @return the new statess
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess createStatess(
		int id) {

		return _statessLocalService.createStatess(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statessLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the statess with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the statess
	 * @return the statess that was removed
	 * @throws PortalException if a statess with the primary key could not be found
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess deleteStatess(int id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statessLocalService.deleteStatess(id);
	}

	/**
	 * Deletes the statess from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statess the statess
	 * @return the statess that was removed
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess deleteStatess(
		com.liferay.training.zain.states.model.Statess statess) {

		return _statessLocalService.deleteStatess(statess);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _statessLocalService.dynamicQuery();
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

		return _statessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.zain.states.model.impl.StatessModelImpl</code>.
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

		return _statessLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.zain.states.model.impl.StatessModelImpl</code>.
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

		return _statessLocalService.dynamicQuery(
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

		return _statessLocalService.dynamicQueryCount(dynamicQuery);
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

		return _statessLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.zain.states.model.Statess fetchStatess(int id) {
		return _statessLocalService.fetchStatess(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _statessLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _statessLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _statessLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the statess with the primary key.
	 *
	 * @param id the primary key of the statess
	 * @return the statess
	 * @throws PortalException if a statess with the primary key could not be found
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess getStatess(int id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statessLocalService.getStatess(id);
	}

	/**
	 * Returns a range of all the statesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.zain.states.model.impl.StatessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @return the range of statesses
	 */
	@Override
	public java.util.List<com.liferay.training.zain.states.model.Statess>
		getStatesses(int start, int end) {

		return _statessLocalService.getStatesses(start, end);
	}

	/**
	 * Returns the number of statesses.
	 *
	 * @return the number of statesses
	 */
	@Override
	public int getStatessesCount() {
		return _statessLocalService.getStatessesCount();
	}

	/**
	 * Updates the statess in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statess the statess
	 * @return the statess that was updated
	 */
	@Override
	public com.liferay.training.zain.states.model.Statess updateStatess(
		com.liferay.training.zain.states.model.Statess statess) {

		return _statessLocalService.updateStatess(statess);
	}

	@Override
	public StatessLocalService getWrappedService() {
		return _statessLocalService;
	}

	@Override
	public void setWrappedService(StatessLocalService statessLocalService) {
		_statessLocalService = statessLocalService;
	}

	private StatessLocalService _statessLocalService;

}