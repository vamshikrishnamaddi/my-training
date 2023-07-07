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

package com.liferay.zain.practice.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.zain.practice.exception.NoSuchnormalException;
import com.liferay.zain.practice.model.impl.normalImpl;
import com.liferay.zain.practice.model.impl.normalModelImpl;
import com.liferay.zain.practice.model.normal;
import com.liferay.zain.practice.service.persistence.impl.constants.ZainPersistenceConstants;
import com.liferay.zain.practice.service.persistence.normalPersistence;
import com.liferay.zain.practice.service.persistence.normalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the normal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = normalPersistence.class)
public class normalPersistenceImpl
	extends BasePersistenceImpl<normal> implements normalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>normalUtil</code> to access the normal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		normalImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetDataByareazone;
	private FinderPath _finderPathWithoutPaginationFindBygetDataByareazone;
	private FinderPath _finderPathCountBygetDataByareazone;

	/**
	 * Returns all the normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the matching normals
	 */
	@Override
	public List<normal> findBygetDataByareazone(String governorate) {
		return findBygetDataByareazone(
			governorate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<normal> findBygetDataByareazone(
		String governorate, int start, int end) {

		return findBygetDataByareazone(governorate, start, end, null);
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
	@Override
	public List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		OrderByComparator<normal> orderByComparator) {

		return findBygetDataByareazone(
			governorate, start, end, orderByComparator, true);
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
	@Override
	public List<normal> findBygetDataByareazone(
		String governorate, int start, int end,
		OrderByComparator<normal> orderByComparator, boolean useFinderCache) {

		governorate = Objects.toString(governorate, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDataByareazone;
				finderArgs = new Object[] {governorate};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetDataByareazone;
			finderArgs = new Object[] {
				governorate, start, end, orderByComparator
			};
		}

		List<normal> list = null;

		if (useFinderCache) {
			list = (List<normal>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (normal normal : list) {
					if (!governorate.equals(normal.getGovernorate())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_NORMAL_WHERE);

			boolean bindGovernorate = false;

			if (governorate.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_3);
			}
			else {
				bindGovernorate = true;

				sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(normalModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindGovernorate) {
					queryPos.add(governorate);
				}

				list = (List<normal>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	@Override
	public normal findBygetDataByareazone_First(
			String governorate, OrderByComparator<normal> orderByComparator)
		throws NoSuchnormalException {

		normal normal = fetchBygetDataByareazone_First(
			governorate, orderByComparator);

		if (normal != null) {
			return normal;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("governorate=");
		sb.append(governorate);

		sb.append("}");

		throw new NoSuchnormalException(sb.toString());
	}

	/**
	 * Returns the first normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching normal, or <code>null</code> if a matching normal could not be found
	 */
	@Override
	public normal fetchBygetDataByareazone_First(
		String governorate, OrderByComparator<normal> orderByComparator) {

		List<normal> list = findBygetDataByareazone(
			governorate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal
	 * @throws NoSuchnormalException if a matching normal could not be found
	 */
	@Override
	public normal findBygetDataByareazone_Last(
			String governorate, OrderByComparator<normal> orderByComparator)
		throws NoSuchnormalException {

		normal normal = fetchBygetDataByareazone_Last(
			governorate, orderByComparator);

		if (normal != null) {
			return normal;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("governorate=");
		sb.append(governorate);

		sb.append("}");

		throw new NoSuchnormalException(sb.toString());
	}

	/**
	 * Returns the last normal in the ordered set where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching normal, or <code>null</code> if a matching normal could not be found
	 */
	@Override
	public normal fetchBygetDataByareazone_Last(
		String governorate, OrderByComparator<normal> orderByComparator) {

		int count = countBygetDataByareazone(governorate);

		if (count == 0) {
			return null;
		}

		List<normal> list = findBygetDataByareazone(
			governorate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public normal[] findBygetDataByareazone_PrevAndNext(
			long sampleId, String governorate,
			OrderByComparator<normal> orderByComparator)
		throws NoSuchnormalException {

		governorate = Objects.toString(governorate, "");

		normal normal = findByPrimaryKey(sampleId);

		Session session = null;

		try {
			session = openSession();

			normal[] array = new normalImpl[3];

			array[0] = getBygetDataByareazone_PrevAndNext(
				session, normal, governorate, orderByComparator, true);

			array[1] = normal;

			array[2] = getBygetDataByareazone_PrevAndNext(
				session, normal, governorate, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected normal getBygetDataByareazone_PrevAndNext(
		Session session, normal normal, String governorate,
		OrderByComparator<normal> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NORMAL_WHERE);

		boolean bindGovernorate = false;

		if (governorate.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_3);
		}
		else {
			bindGovernorate = true;

			sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(normalModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindGovernorate) {
			queryPos.add(governorate);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(normal)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<normal> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the normals where governorate = &#63; from the database.
	 *
	 * @param governorate the governorate
	 */
	@Override
	public void removeBygetDataByareazone(String governorate) {
		for (normal normal :
				findBygetDataByareazone(
					governorate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(normal);
		}
	}

	/**
	 * Returns the number of normals where governorate = &#63;.
	 *
	 * @param governorate the governorate
	 * @return the number of matching normals
	 */
	@Override
	public int countBygetDataByareazone(String governorate) {
		governorate = Objects.toString(governorate, "");

		FinderPath finderPath = _finderPathCountBygetDataByareazone;

		Object[] finderArgs = new Object[] {governorate};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NORMAL_WHERE);

			boolean bindGovernorate = false;

			if (governorate.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_3);
			}
			else {
				bindGovernorate = true;

				sb.append(_FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindGovernorate) {
					queryPos.add(governorate);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_2 =
		"normal.governorate = ?";

	private static final String _FINDER_COLUMN_GETDATABYAREAZONE_GOVERNORATE_3 =
		"(normal.governorate IS NULL OR normal.governorate = '')";

	public normalPersistenceImpl() {
		setModelClass(normal.class);

		setModelImplClass(normalImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the normal in the entity cache if it is enabled.
	 *
	 * @param normal the normal
	 */
	@Override
	public void cacheResult(normal normal) {
		entityCache.putResult(
			entityCacheEnabled, normalImpl.class, normal.getPrimaryKey(),
			normal);

		normal.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the normals in the entity cache if it is enabled.
	 *
	 * @param normals the normals
	 */
	@Override
	public void cacheResult(List<normal> normals) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (normals.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (normal normal : normals) {
			if (entityCache.getResult(
					entityCacheEnabled, normalImpl.class,
					normal.getPrimaryKey()) == null) {

				cacheResult(normal);
			}
			else {
				normal.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all normals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(normalImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the normal.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(normal normal) {
		entityCache.removeResult(
			entityCacheEnabled, normalImpl.class, normal.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<normal> normals) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (normal normal : normals) {
			entityCache.removeResult(
				entityCacheEnabled, normalImpl.class, normal.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, normalImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new normal with the primary key. Does not add the normal to the database.
	 *
	 * @param sampleId the primary key for the new normal
	 * @return the new normal
	 */
	@Override
	public normal create(long sampleId) {
		normal normal = new normalImpl();

		normal.setNew(true);
		normal.setPrimaryKey(sampleId);

		normal.setCompanyId(CompanyThreadLocal.getCompanyId());

		return normal;
	}

	/**
	 * Removes the normal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal that was removed
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	@Override
	public normal remove(long sampleId) throws NoSuchnormalException {
		return remove((Serializable)sampleId);
	}

	/**
	 * Removes the normal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the normal
	 * @return the normal that was removed
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	@Override
	public normal remove(Serializable primaryKey) throws NoSuchnormalException {
		Session session = null;

		try {
			session = openSession();

			normal normal = (normal)session.get(normalImpl.class, primaryKey);

			if (normal == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnormalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(normal);
		}
		catch (NoSuchnormalException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected normal removeImpl(normal normal) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(normal)) {
				normal = (normal)session.get(
					normalImpl.class, normal.getPrimaryKeyObj());
			}

			if (normal != null) {
				session.delete(normal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (normal != null) {
			clearCache(normal);
		}

		return normal;
	}

	@Override
	public normal updateImpl(normal normal) {
		boolean isNew = normal.isNew();

		if (!(normal instanceof normalModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(normal.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(normal);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in normal proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom normal implementation " +
					normal.getClass());
		}

		normalModelImpl normalModelImpl = (normalModelImpl)normal;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (normal.getCreateDate() == null)) {
			if (serviceContext == null) {
				normal.setCreateDate(date);
			}
			else {
				normal.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!normalModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				normal.setModifiedDate(date);
			}
			else {
				normal.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(normal);

				normal.setNew(false);
			}
			else {
				normal = (normal)session.merge(normal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {normalModelImpl.getGovernorate()};

			finderCache.removeResult(_finderPathCountBygetDataByareazone, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBygetDataByareazone, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((normalModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBygetDataByareazone.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					normalModelImpl.getOriginalGovernorate()
				};

				finderCache.removeResult(
					_finderPathCountBygetDataByareazone, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBygetDataByareazone, args);

				args = new Object[] {normalModelImpl.getGovernorate()};

				finderCache.removeResult(
					_finderPathCountBygetDataByareazone, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBygetDataByareazone, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, normalImpl.class, normal.getPrimaryKey(),
			normal, false);

		normal.resetOriginalValues();

		return normal;
	}

	/**
	 * Returns the normal with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the normal
	 * @return the normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	@Override
	public normal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnormalException {

		normal normal = fetchByPrimaryKey(primaryKey);

		if (normal == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnormalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return normal;
	}

	/**
	 * Returns the normal with the primary key or throws a <code>NoSuchnormalException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal
	 * @throws NoSuchnormalException if a normal with the primary key could not be found
	 */
	@Override
	public normal findByPrimaryKey(long sampleId) throws NoSuchnormalException {
		return findByPrimaryKey((Serializable)sampleId);
	}

	/**
	 * Returns the normal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the normal
	 * @return the normal, or <code>null</code> if a normal with the primary key could not be found
	 */
	@Override
	public normal fetchByPrimaryKey(long sampleId) {
		return fetchByPrimaryKey((Serializable)sampleId);
	}

	/**
	 * Returns all the normals.
	 *
	 * @return the normals
	 */
	@Override
	public List<normal> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<normal> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<normal> findAll(
		int start, int end, OrderByComparator<normal> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<normal> findAll(
		int start, int end, OrderByComparator<normal> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<normal> list = null;

		if (useFinderCache) {
			list = (List<normal>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NORMAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NORMAL;

				sql = sql.concat(normalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<normal>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the normals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (normal normal : findAll()) {
			remove(normal);
		}
	}

	/**
	 * Returns the number of normals.
	 *
	 * @return the number of normals
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NORMAL);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sampleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NORMAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return normalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the normal persistence.
	 */
	@Activate
	public void activate() {
		normalModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		normalModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, normalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, normalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBygetDataByareazone = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, normalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetDataByareazone",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBygetDataByareazone = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, normalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetDataByareazone", new String[] {String.class.getName()},
			normalModelImpl.GOVERNORATE_COLUMN_BITMASK);

		_finderPathCountBygetDataByareazone = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDataByareazone", new String[] {String.class.getName()});

		_setnormalUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setnormalUtilPersistence(null);

		entityCache.removeCache(normalImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setnormalUtilPersistence(
		normalPersistence normalPersistence) {

		try {
			Field field = normalUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, normalPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = ZainPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.zain.practice.model.normal"),
			true);
	}

	@Override
	@Reference(
		target = ZainPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ZainPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NORMAL =
		"SELECT normal FROM normal normal";

	private static final String _SQL_SELECT_NORMAL_WHERE =
		"SELECT normal FROM normal normal WHERE ";

	private static final String _SQL_COUNT_NORMAL =
		"SELECT COUNT(normal) FROM normal normal";

	private static final String _SQL_COUNT_NORMAL_WHERE =
		"SELECT COUNT(normal) FROM normal normal WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "normal.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No normal exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No normal exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		normalPersistenceImpl.class);

}