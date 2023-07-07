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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.zain.practice.exception.NoSuchnormalException;
import com.liferay.zain.practice.model.normal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the normal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see normalUtil
 * @generated
 */
@ProviderType
public interface normalPersistence extends BasePersistence<normal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link normalUtil} to access the normal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the matching normals
	 */
	public java.util.List<normal> findBygetDataByareazone(String governorate);

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
	public java.util.List<normal> findBygetDataByareazone(
		String governorate, int start, int end);

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
	public java.util.List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator);

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
	public java.util.List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	public normal findBygetDataByareazone_First(
			String governorate,
			com.liferay.portal.kernel.util.OrderByComparator<normal>
				orderByComparator)
		throws NoSuchnormalException;

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal, or <code>null</code> if a matching normal could not be found
	 */
	public normal fetchBygetDataByareazone_First(
		String governorate,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator);

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	public normal findBygetDataByareazone_Last(
			String governorate,
			com.liferay.portal.kernel.util.OrderByComparator<normal>
				orderByComparator)
		throws NoSuchnormalException;

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal, or <code>null</code> if a matching normal could not be found
	 */
	public normal fetchBygetDataByareazone_Last(
		String governorate,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator);

	/**
	 * Returns the normals before and after the current normal in the ordered set where governorate = &#63;.
	 *
	 * @param sampleId the primary key of the current normal
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public normal[] findBygetDataByareazone_PrevAndNext(
			long sampleId, String governorate,
			com.liferay.portal.kernel.util.OrderByComparator<normal>
				orderByComparator)
		throws NoSuchnormalException;

	/**
	 * Removes all the normals where governorate = &#63; from the database.
	 *
	 * @param governorate the governorate
	 */
	public void removeBygetDataByareazone(String governorate);

	/**
	 * Returns the number of normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the number of matching normals
	 */
	public int countBygetDataByareazone(String governorate);

	/**
	 * Caches the normal in the entity cache if it is enabled.
	 *
	 * @param normal the normal
	 */
	public void cacheResult(normal normal);

	/**
	 * Caches the normals in the entity cache if it is enabled.
	 *
	 * @param normals the normals
	 */
	public void cacheResult(java.util.List<normal> normals);

	/**
	 * Creates a new normal with the primary key. Does not add the normal to the database.
	 *
	 * @param sampleId the primary key for the new normal
	 * @return the new normal
	 */
	public normal create(long sampleId);

	/**
	 * Removes the normal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal that was removed
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public normal remove(long sampleId) throws NoSuchnormalException;

	public normal updateImpl(normal normal);

	/**
	 * Returns the normal with the primary key or throws a <code>NoSuchnormalException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	public normal findByPrimaryKey(long sampleId) throws NoSuchnormalException;

	/**
	 * Returns the normal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal, or <code>null</code> if a normal with the primary key could not be found
	 */
	public normal fetchByPrimaryKey(long sampleId);

	/**
	 * Returns all the normals.
	 *
	 * @return the normals
	 */
	public java.util.List<normal> findAll();

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
	public java.util.List<normal> findAll(int start, int end);

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
	public java.util.List<normal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator);

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
	public java.util.List<normal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<normal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the normals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of normals.
	 *
	 * @return the number of normals
	 */
	public int countAll();

}