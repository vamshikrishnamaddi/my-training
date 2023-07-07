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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.zain.states.exception.NoSuchStatessException;
import com.liferay.training.zain.states.model.Statess;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the statess service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatessUtil
 * @generated
 */
@ProviderType
public interface StatessPersistence extends BasePersistence<Statess> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatessUtil} to access the statess persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the statesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statesses
	 */
	public java.util.List<Statess> findByUuid(String uuid);

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
	public java.util.List<Statess> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Statess> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator);

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
	public java.util.List<Statess> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statess
	 * @throws NoSuchStatessException if a matching statess could not be found
	 */
	public Statess findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Statess>
				orderByComparator)
		throws NoSuchStatessException;

	/**
	 * Returns the first statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statess, or <code>null</code> if a matching statess could not be found
	 */
	public Statess fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator);

	/**
	 * Returns the last statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statess
	 * @throws NoSuchStatessException if a matching statess could not be found
	 */
	public Statess findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Statess>
				orderByComparator)
		throws NoSuchStatessException;

	/**
	 * Returns the last statess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statess, or <code>null</code> if a matching statess could not be found
	 */
	public Statess fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator);

	/**
	 * Returns the statesses before and after the current statess in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current statess
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statess
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public Statess[] findByUuid_PrevAndNext(
			int id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Statess>
				orderByComparator)
		throws NoSuchStatessException;

	/**
	 * Removes all the statesses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of statesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statesses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the statess in the entity cache if it is enabled.
	 *
	 * @param statess the statess
	 */
	public void cacheResult(Statess statess);

	/**
	 * Caches the statesses in the entity cache if it is enabled.
	 *
	 * @param statesses the statesses
	 */
	public void cacheResult(java.util.List<Statess> statesses);

	/**
	 * Creates a new statess with the primary key. Does not add the statess to the database.
	 *
	 * @param id the primary key for the new statess
	 * @return the new statess
	 */
	public Statess create(int id);

	/**
	 * Removes the statess with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the statess
	 * @return the statess that was removed
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public Statess remove(int id) throws NoSuchStatessException;

	public Statess updateImpl(Statess statess);

	/**
	 * Returns the statess with the primary key or throws a <code>NoSuchStatessException</code> if it could not be found.
	 *
	 * @param id the primary key of the statess
	 * @return the statess
	 * @throws NoSuchStatessException if a statess with the primary key could not be found
	 */
	public Statess findByPrimaryKey(int id) throws NoSuchStatessException;

	/**
	 * Returns the statess with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the statess
	 * @return the statess, or <code>null</code> if a statess with the primary key could not be found
	 */
	public Statess fetchByPrimaryKey(int id);

	/**
	 * Returns all the statesses.
	 *
	 * @return the statesses
	 */
	public java.util.List<Statess> findAll();

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
	public java.util.List<Statess> findAll(int start, int end);

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
	public java.util.List<Statess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator);

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
	public java.util.List<Statess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Statess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the statesses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of statesses.
	 *
	 * @return the number of statesses
	 */
	public int countAll();

}