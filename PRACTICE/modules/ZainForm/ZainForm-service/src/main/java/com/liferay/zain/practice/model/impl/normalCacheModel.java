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

package com.liferay.zain.practice.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.zain.practice.model.normal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing normal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class normalCacheModel implements CacheModel<normal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof normalCacheModel)) {
			return false;
		}

		normalCacheModel normalCacheModel = (normalCacheModel)object;

		if (sampleId == normalCacheModel.sampleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sampleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sampleId=");
		sb.append(sampleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", catalog=");
		sb.append(catalog);
		sb.append(", governorate=");
		sb.append(governorate);
		sb.append(", areazone=");
		sb.append(areazone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public normal toEntityModel() {
		normalImpl normalImpl = new normalImpl();

		normalImpl.setSampleId(sampleId);
		normalImpl.setGroupId(groupId);
		normalImpl.setCompanyId(companyId);
		normalImpl.setUserId(userId);

		if (userName == null) {
			normalImpl.setUserName("");
		}
		else {
			normalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			normalImpl.setCreateDate(null);
		}
		else {
			normalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			normalImpl.setModifiedDate(null);
		}
		else {
			normalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			normalImpl.setName("");
		}
		else {
			normalImpl.setName(name);
		}

		if (catalog == null) {
			normalImpl.setCatalog("");
		}
		else {
			normalImpl.setCatalog(catalog);
		}

		if (governorate == null) {
			normalImpl.setGovernorate("");
		}
		else {
			normalImpl.setGovernorate(governorate);
		}

		if (areazone == null) {
			normalImpl.setAreazone("");
		}
		else {
			normalImpl.setAreazone(areazone);
		}

		normalImpl.resetOriginalValues();

		return normalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sampleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		catalog = objectInput.readUTF();
		governorate = objectInput.readUTF();
		areazone = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sampleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (catalog == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(catalog);
		}

		if (governorate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(governorate);
		}

		if (areazone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areazone);
		}
	}

	public long sampleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String catalog;
	public String governorate;
	public String areazone;

}