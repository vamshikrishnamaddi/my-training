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

package com.liferay.training.zain.states.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.training.zain.states.service.http.StatessServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StatessSoap implements Serializable {

	public static StatessSoap toSoapModel(Statess model) {
		StatessSoap soapModel = new StatessSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setCountry_id(model.getCountry_id());

		return soapModel;
	}

	public static StatessSoap[] toSoapModels(Statess[] models) {
		StatessSoap[] soapModels = new StatessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatessSoap[][] toSoapModels(Statess[][] models) {
		StatessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatessSoap[] toSoapModels(List<Statess> models) {
		List<StatessSoap> soapModels = new ArrayList<StatessSoap>(
			models.size());

		for (Statess model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatessSoap[soapModels.size()]);
	}

	public StatessSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getCountry_id() {
		return _country_id;
	}

	public void setCountry_id(int country_id) {
		_country_id = country_id;
	}

	private String _uuid;
	private int _id;
	private String _name;
	private int _country_id;

}