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

package com.liferay.zain.practice.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.zain.practice.model.normal;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the normal service. This utility wraps <code>com.liferay.zain.practice.service.persistence.impl.normalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see normalPersistence
 * @generated
 */
public class normalUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(normal normal) {
		getPersistence().clearCache(normal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, normal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<normal> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<normal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<normal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<normal> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static normal update(normal normal) {
		return getPersistence().update(normal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static normal update(normal normal, ServiceContext serviceContext) {
		return getPersistence().update(normal, serviceContext);
	}

	/**
	 * Returns all the normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the matching normals
	 */
	public static List<normal> findBygetDataByareazone(String governorate) {
		return getPersistence().findBygetDataByareazone(governorate);
	}

	/**
	 * Returns a range of all the normals where governorate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param governorate the governorate
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @return the range of matching normals
	 */
	public static List<normal> findBygetDataByareazone(
		String governorate, int start, int end) {

		return getPersistence().findBygetDataByareazone(
			governorate, start, end);
	}

	/**
	 * Returns an ordered range of all the normals where governorate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param governorate the governorate
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching normals
	 */
	public static List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		OrderByComparator<normal> orderByComparator) {

		return getPersistence().findBygetDataByareazone(
			governorate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the normals where governorate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param governorate the governorate
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching normals
	 */
	public static List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		OrderByComparator<normal> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBygetDataByareazone(
			governorate, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	public static normal findBygetDataByareazone_First(
			String governorate, OrderByComparator<normal> orderByComparator)
		throws com.liferay.zain.practice.exception.NoSuchnormalException {

		return getPersistence().findBygetDataByareazone_First(
			governorate, orderByComparator);
	}

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal, or <code>null</code> if a matching normal could not be found
	 */
	public static normal fetchBygetDataByareazone_First(
		String governorate, OrderByComparator<normal> orderByComparator) {

		return getPersistence().fetchBygetDataByareazone_First(
			governorate, orderByComparator);
	}

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	public static normal findBygetDataByareazone_Last(
			String governorate, OrderByComparator<normal> orderByComparator)
		throws com.liferay.zain.practice.exception.NoSuchnormalException {

		return getPersistence().findBygetDataByareazone_Last(
			governorate, orderByComparator);
	}

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal, or <code>null</code> if a matching normal could not be found
	 */
	public static normal fetchBygetDataByareazone_Last(
		String governorate, OrderByComparator<normal> orderByComparator) {

		return getPersistence().fetchBygetDataByareazone_Last(
			governorate, orderByComparator);
	}

	/**
	 * Returns the normals before and after the current normal in the ordered set where governorate = &#63;.
	 *
	 * @param sampleId the primary key of the current normal
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public static normal[] findBygetDataByareazone_PrevAndNext(
			long sampleId, String governorate,
			OrderByComparator<normal> orderByComparator)
		throws com.liferay.zain.practice.exception.NoSuchnormalException {

		return getPersistence().findBygetDataByareazone_PrevAndNext(
			sampleId, governorate, orderByComparator);
	}

	/**
	 * Removes all the normals where governorate = &#63; from the database.
	 *
	 * @param governorate the governorate
	 */
	public static void removeBygetDataByareazone(String governorate) {
		getPersistence().removeBygetDataByareazone(governorate);
	}

	/**
	 * Returns the number of normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the number of matching normals
	 */
	public static int countBygetDataByareazone(String governorate) {
		return getPersistence().countBygetDataByareazone(governorate);
	}

	/**
	 * Caches the normal in the entity cache if it is enabled.
	 *
	 * @param normal the normal
	 */
	public static void cacheResult(normal normal) {
		getPersistence().cacheResult(normal);
	}

	/**
	 * Caches the normals in the entity cache if it is enabled.
	 *
	 * @param normals the normals
	 */
	public static void cacheResult(List<normal> normals) {
		getPersistence().cacheResult(normals);
	}

	/**
	 * Creates a new normal with the primary key. Does not add the normal to the database.
	 *
	 * @param sampleId the primary key for the new normal
	 * @return the new normal
	 */
	public static normal create(long sampleId) {
		return getPersistence().create(sampleId);
	}

	/**
	 * Removes the normal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal that was removed
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public static normal remove(long sampleId)
		throws com.liferay.zain.practice.exception.NoSuchnormalException {

		return getPersistence().remove(sampleId);
	}

	public static normal updateImpl(normal normal) {
		return getPersistence().updateImpl(normal);
	}

	/**
	 * Returns the normal with the primary key or throws a <code>NoSuchnormalException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public static normal findByPrimaryKey(long sampleId)
		throws com.liferay.zain.practice.exception.NoSuchnormalException {

		return getPersistence().findByPrimaryKey(sampleId);
	}

	/**
	 * Returns the normal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal, or <code>null</code> if a normal with the primary key could not be found
	 */
	public static normal fetchByPrimaryKey(long sampleId) {
		return getPersistence().fetchByPrimaryKey(sampleId);
	}

	/**
	 * Returns all the normals.
	 *
	 * @return the normals
	 */
	public static List<normal> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the normals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @return the range of normals
	 */
	public static List<normal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the normals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of normals
	 */
	public static List<normal> findAll(
		int start, int end, OrderByComparator<normal> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the normals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>normalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of normals
	 * @param end the upper bound of the range of normals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of normals
	 */
	public static List<normal> findAll(
		int start, int end, OrderByComparator<normal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the normals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of normals.
	 *
	 * @return the number of normals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static normalPersistence getPersistence() {
		return _persistence;
	}

	private static volatile normalPersistence _persistence;

}