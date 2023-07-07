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

package com.liferay.zain.practice.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link normal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see normal
 * @generated
 */
public class normalWrapper
	extends BaseModelWrapper<normal> implements ModelWrapper<normal>, normal {

	public normalWrapper(normal normal) {
		super(normal);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sampleId", getSampleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("catalog", getCatalog());
		attributes.put("governorate", getGovernorate());
		attributes.put("areazone", getAreazone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sampleId = (Long)attributes.get("sampleId");

		if (sampleId != null) {
			setSampleId(sampleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String catalog = (String)attributes.get("catalog");

		if (catalog != null) {
			setCatalog(catalog);
		}

		String governorate = (String)attributes.get("governorate");

		if (governorate != null) {
			setGovernorate(governorate);
		}

		String areazone = (String)attributes.get("areazone");

		if (areazone != null) {
			setAreazone(areazone);
		}
	}

	/**
	 * Returns the areazone of this normal.
	 *
	 * @return the areazone of this normal
	 */
	@Override
	public String getAreazone() {
		return model.getAreazone();
	}

	/**
	 * Returns the catalog of this normal.
	 *
	 * @return the catalog of this normal
	 */
	@Override
	public String getCatalog() {
		return model.getCatalog();
	}

	/**
	 * Returns the company ID of this normal.
	 *
	 * @return the company ID of this normal
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this normal.
	 *
	 * @return the create date of this normal
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the governorate of this normal.
	 *
	 * @return the governorate of this normal
	 */
	@Override
	public String getGovernorate() {
		return model.getGovernorate();
	}

	/**
	 * Returns the group ID of this normal.
	 *
	 * @return the group ID of this normal
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this normal.
	 *
	 * @return the modified date of this normal
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this normal.
	 *
	 * @return the name of this normal
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this normal.
	 *
	 * @return the primary key of this normal
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sample ID of this normal.
	 *
	 * @return the sample ID of this normal
	 */
	@Override
	public long getSampleId() {
		return model.getSampleId();
	}

	/**
	 * Returns the user ID of this normal.
	 *
	 * @return the user ID of this normal
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this normal.
	 *
	 * @return the user name of this normal
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this normal.
	 *
	 * @return the user uuid of this normal
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the areazone of this normal.
	 *
	 * @param areazone the areazone of this normal
	 */
	@Override
	public void setAreazone(String areazone) {
		model.setAreazone(areazone);
	}

	/**
	 * Sets the catalog of this normal.
	 *
	 * @param catalog the catalog of this normal
	 */
	@Override
	public void setCatalog(String catalog) {
		model.setCatalog(catalog);
	}

	/**
	 * Sets the company ID of this normal.
	 *
	 * @param companyId the company ID of this normal
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this normal.
	 *
	 * @param createDate the create date of this normal
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the governorate of this normal.
	 *
	 * @param governorate the governorate of this normal
	 */
	@Override
	public void setGovernorate(String governorate) {
		model.setGovernorate(governorate);
	}

	/**
	 * Sets the group ID of this normal.
	 *
	 * @param groupId the group ID of this normal
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this normal.
	 *
	 * @param modifiedDate the modified date of this normal
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this normal.
	 *
	 * @param name the name of this normal
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this normal.
	 *
	 * @param primaryKey the primary key of this normal
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sample ID of this normal.
	 *
	 * @param sampleId the sample ID of this normal
	 */
	@Override
	public void setSampleId(long sampleId) {
		model.setSampleId(sampleId);
	}

	/**
	 * Sets the user ID of this normal.
	 *
	 * @param userId the user ID of this normal
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this normal.
	 *
	 * @param userName the user name of this normal
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this normal.
	 *
	 * @param userUuid the user uuid of this normal
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected normalWrapper wrap(normal normal) {
		return new normalWrapper(normal);
	}

}