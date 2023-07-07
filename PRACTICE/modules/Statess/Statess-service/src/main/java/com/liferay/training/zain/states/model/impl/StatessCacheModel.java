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

package com.liferay.training.zain.states.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.zain.states.model.Statess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Statess in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StatessCacheModel implements CacheModel<Statess>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StatessCacheModel)) {
			return false;
		}

		StatessCacheModel statessCacheModel = (StatessCacheModel)object;

		if (id == statessCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", country_id=");
		sb.append(country_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Statess toEntityModel() {
		StatessImpl statessImpl = new StatessImpl();

		if (uuid == null) {
			statessImpl.setUuid("");
		}
		else {
			statessImpl.setUuid(uuid);
		}

		statessImpl.setId(id);

		if (name == null) {
			statessImpl.setName("");
		}
		else {
			statessImpl.setName(name);
		}

		statessImpl.setCountry_id(country_id);

		statessImpl.resetOriginalValues();

		return statessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readInt();
		name = objectInput.readUTF();

		country_id = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(country_id);
	}

	public String uuid;
	public int id;
	public String name;
	public int country_id;

}