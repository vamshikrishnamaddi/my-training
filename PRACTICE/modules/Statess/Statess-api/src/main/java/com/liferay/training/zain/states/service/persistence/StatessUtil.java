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

package com.liferay.training.zain.states.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.zain.states.model.Statess;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the statess service. This utility wraps <code>com.liferay.training.zain.states.service.persistence.impl.StatessPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatessPersistence
 * @generated
 */
public class StatessUtil {

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
	public static void clearCache(Statess statess) {
		getPersistence().clearCache(statess);
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
	public static Map<Serializable, Statess> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Statess> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Statess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Statess> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Statess> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Statess update(Statess statess) {
		return getPersistence().update(statess);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Statess update(
		Statess statess, ServiceContext serviceContext) {

		return getPersistence().update(statess, serviceContext);
	}

	/**
	 * Returns all the statesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statesses
	 */
	public static List<Statess> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the statesses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @return the range of matching statesses
	 */
	public static List<Statess> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the statesses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statesses
	 */
	public static List<Statess> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Statess> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statesses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching statesses
	 */
	public static List<Statess> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Statess> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statess
	 * @throws NoSuchStatessException if a matching statess could not be found
	 */
	public static Statess findByUuid_First(
			String uuid, OrderByComparator<Statess> orderByComparator)
		throws com.liferay.training.zain.states.exception.
			NoSuchStatessException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statess, or <code>null</code> if a matching statess could not be found
	 */
	public static Statess fetchByUuid_First(
		String uuid, OrderByComparator<Statess> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statess
	 * @throws NoSuchStatessException if a matching statess could not be found
	 */
	public static Statess findByUuid_Last(
			String uuid, OrderByComparator<Statess> orderByComparator)
		throws com.liferay.training.zain.states.exception.
			NoSuchStatessException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statess, or <code>null</code> if a matching statess could not be found
	 */
	public static Statess fetchByUuid_Last(
		String uuid, OrderByComparator<Statess> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the statesses before and after the current statess in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current statess
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statess
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public static Statess[] findByUuid_PrevAndNext(
			int id, String uuid, OrderByComparator<Statess> orderByComparator)
		throws com.liferay.training.zain.states.exception.
			NoSuchStatessException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the statesses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of statesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statesses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the statess in the entity cache if it is enabled.
	 *
	 * @param statess the statess
	 */
	public static void cacheResult(Statess statess) {
		getPersistence().cacheResult(statess);
	}

	/**
	 * Caches the statesses in the entity cache if it is enabled.
	 *
	 * @param statesses the statesses
	 */
	public static void cacheResult(List<Statess> statesses) {
		getPersistence().cacheResult(statesses);
	}

	/**
	 * Creates a new statess with the primary key. Does not add the statess to the database.
	 *
	 * @param id the primary key for the new statess
	 * @return the new statess
	 */
	public static Statess create(int id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the statess with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the statess
	 * @return the statess that was removed
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public static Statess remove(int id)
		throws com.liferay.training.zain.states.exception.
			NoSuchStatessException {

		return getPersistence().remove(id);
	}

	public static Statess updateImpl(Statess statess) {
		return getPersistence().updateImpl(statess);
	}

	/**
	 * Returns the statess with the primary key or throws a <code>NoSuchStatessException</code> if it could not be found.
	 *
	 * @param id the primary key of the statess
	 * @return the statess
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public static Statess findByPrimaryKey(int id)
		throws com.liferay.training.zain.states.exception.
			NoSuchStatessException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the statess with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the statess
	 * @return the statess, or <code>null</code> if a statess with the primary key could not be found
	 */
	public static Statess fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the statesses.
	 *
	 * @return the statesses
	 */
	public static List<Statess> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the statesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @return the range of statesses
	 */
	public static List<Statess> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the statesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statesses
	 */
	public static List<Statess> findAll(
		int start, int end, OrderByComparator<Statess> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statesses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statesses
	 * @param end the upper bound of the range of statesses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of statesses
	 */
	public static List<Statess> findAll(
		int start, int end, OrderByComparator<Statess> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the statesses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of statesses.
	 *
	 * @return the number of statesses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StatessPersistence getPersistence() {
		return _persistence;
	}

	private static volatile StatessPersistence _persistence;

}