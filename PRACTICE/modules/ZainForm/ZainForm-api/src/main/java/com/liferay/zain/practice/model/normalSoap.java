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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.zain.practice.service.http.normalServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class normalSoap implements Serializable {

	public static normalSoap toSoapModel(normal model) {
		normalSoap soapModel = new normalSoap();

		soapModel.setSampleId(model.getSampleId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setCatalog(model.getCatalog());
		soapModel.setGovernorate(model.getGovernorate());
		soapModel.setAreazone(model.getAreazone());

		return soapModel;
	}

	public static normalSoap[] toSoapModels(normal[] models) {
		normalSoap[] soapModels = new normalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static normalSoap[][] toSoapModels(normal[][] models) {
		normalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new normalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new normalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static normalSoap[] toSoapModels(List<normal> models) {
		List<normalSoap> soapModels = new ArrayList<normalSoap>(models.size());

		for (normal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new normalSoap[soapModels.size()]);
	}

	public normalSoap() {
	}

	public long getPrimaryKey() {
		return _sampleId;
	}

	public void setPrimaryKey(long pk) {
		setSampleId(pk);
	}

	public long getSampleId() {
		return _sampleId;
	}

	public void setSampleId(long sampleId) {
		_sampleId = sampleId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCatalog() {
		return _catalog;
	}

	public void setCatalog(String catalog) {
		_catalog = catalog;
	}

	public String getGovernorate() {
		return _governorate;
	}

	public void setGovernorate(String governorate) {
		_governorate = governorate;
	}

	public String getAreazone() {
		return _areazone;
	}

	public void setAreazone(String areazone) {
		_areazone = areazone;
	}

	private long _sampleId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _catalog;
	private String _governorate;
	private String _areazone;

}