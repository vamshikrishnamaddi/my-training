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

package com.liferay.zain.model.impl;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.zain.model.City;
import com.liferay.zain.model.CityModel;
import com.liferay.zain.model.CitySoap;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the City service. Represents a row in the &quot;Zain_City&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CityModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CityImpl
 * @generated
 */
@JSON(strict = true)
public class CityModelImpl extends BaseModelImpl<City> implements CityModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a city model instance should use the <code>City</code> interface instead.
	 */
	public static final String TABLE_NAME = "Zain_City";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"id_", Types.INTEGER},
		{"city", Types.VARCHAR}, {"state_id", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("id_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_id", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Zain_City (uuid_ VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,id_ INTEGER not null primary key,city VARCHAR(75) null,state_id INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table Zain_City";

	public static final String ORDER_BY_JPQL = " ORDER BY city.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY Zain_City.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long ID_COLUMN_BITMASK = 8L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static City toModel(CitySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		City model = new CityImpl();

		model.setUuid(soapModel.getUuid());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setId(soapModel.getId());
		model.setCity(soapModel.getCity());
		model.setState_id(soapModel.getState_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<City> toModels(CitySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<City> models = new ArrayList<City>(soapModels.length);

		for (CitySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public CityModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return City.class;
	}

	@Override
	public String getModelClassName() {
		return City.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<City, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<City, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<City, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((City)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<City, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<City, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((City)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<City, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<City, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<City, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<City, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<City, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<City, Object>>();
		Map<String, BiConsumer<City, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<City, ?>>();

		attributeGetterFunctions.put("uuid", City::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<City, String>)City::setUuid);
		attributeGetterFunctions.put("groupId", City::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<City, Long>)City::setGroupId);
		attributeGetterFunctions.put("companyId", City::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<City, Long>)City::setCompanyId);
		attributeGetterFunctions.put("userId", City::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<City, Long>)City::setUserId);
		attributeGetterFunctions.put("userName", City::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<City, String>)City::setUserName);
		attributeGetterFunctions.put("createDate", City::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<City, Date>)City::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", City::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<City, Date>)City::setModifiedDate);
		attributeGetterFunctions.put("id", City::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<City, Integer>)City::setId);
		attributeGetterFunctions.put("city", City::getCity);
		attributeSetterBiConsumers.put(
			"city", (BiConsumer<City, String>)City::setCity);
		attributeGetterFunctions.put("state_id", City::getState_id);
		attributeSetterBiConsumers.put(
			"state_id", (BiConsumer<City, Integer>)City::setState_id);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public int getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(int state_id) {
		_state_id = state_id;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(City.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public City toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, City>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CityImpl cityImpl = new CityImpl();

		cityImpl.setUuid(getUuid());
		cityImpl.setGroupId(getGroupId());
		cityImpl.setCompanyId(getCompanyId());
		cityImpl.setUserId(getUserId());
		cityImpl.setUserName(getUserName());
		cityImpl.setCreateDate(getCreateDate());
		cityImpl.setModifiedDate(getModifiedDate());
		cityImpl.setId(getId());
		cityImpl.setCity(getCity());
		cityImpl.setState_id(getState_id());

		cityImpl.resetOriginalValues();

		return cityImpl;
	}

	@Override
	public int compareTo(City city) {
		int primaryKey = city.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof City)) {
			return false;
		}

		City city = (City)object;

		int primaryKey = city.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<City> toCacheModel() {
		CityCacheModel cityCacheModel = new CityCacheModel();

		cityCacheModel.uuid = getUuid();

		String uuid = cityCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			cityCacheModel.uuid = null;
		}

		cityCacheModel.groupId = getGroupId();

		cityCacheModel.companyId = getCompanyId();

		cityCacheModel.userId = getUserId();

		cityCacheModel.userName = getUserName();

		String userName = cityCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			cityCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			cityCacheModel.createDate = createDate.getTime();
		}
		else {
			cityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cityCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			cityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		cityCacheModel.id = getId();

		cityCacheModel.city = getCity();

		String city = cityCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			cityCacheModel.city = null;
		}

		cityCacheModel.state_id = getState_id();

		return cityCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<City, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<City, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<City, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((City)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<City, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<City, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<City, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((City)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, City>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					City.class, ModelWrapper.class);

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _id;
	private String _city;
	private int _state_id;
	private long _columnBitmask;
	private City _escapedModel;

}