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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Statess}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Statess
 * @generated
 */
public class StatessWrapper
	extends BaseModelWrapper<Statess>
	implements ModelWrapper<Statess>, Statess {

	public StatessWrapper(Statess statess) {
		super(statess);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("country_id", getCountry_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer country_id = (Integer)attributes.get("country_id");

		if (country_id != null) {
			setCountry_id(country_id);
		}
	}

	/**
	 * Returns the country_id of this statess.
	 *
	 * @return the country_id of this statess
	 */
	@Override
	public int getCountry_id() {
		return model.getCountry_id();
	}

	/**
	 * Returns the ID of this statess.
	 *
	 * @return the ID of this statess
	 */
	@Override
	public int getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this statess.
	 *
	 * @return the name of this statess
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this statess.
	 *
	 * @return the primary key of this statess
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this statess.
	 *
	 * @return the uuid of this statess
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the country_id of this statess.
	 *
	 * @param country_id the country_id of this statess
	 */
	@Override
	public void setCountry_id(int country_id) {
		model.setCountry_id(country_id);
	}

	/**
	 * Sets the ID of this statess.
	 *
	 * @param id the ID of this statess
	 */
	@Override
	public void setId(int id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this statess.
	 *
	 * @param name the name of this statess
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this statess.
	 *
	 * @param primaryKey the primary key of this statess
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this statess.
	 *
	 * @param uuid the uuid of this statess
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected StatessWrapper wrap(Statess statess) {
		return new StatessWrapper(statess);
	}

}