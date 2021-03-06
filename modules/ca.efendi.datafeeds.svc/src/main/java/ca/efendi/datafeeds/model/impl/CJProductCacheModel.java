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

package ca.efendi.datafeeds.model.impl;

import aQute.bnd.annotation.ProviderType;

import ca.efendi.datafeeds.model.CJProduct;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CJProduct in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CJProduct
 * @generated
 */
@ProviderType
public class CJProductCacheModel implements CacheModel<CJProduct>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CJProductCacheModel)) {
			return false;
		}

		CJProductCacheModel cjProductCacheModel = (CJProductCacheModel)obj;

		if (productId == cjProductCacheModel.productId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(81);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", productId=");
		sb.append(productId);
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
		sb.append(", programName=");
		sb.append(programName);
		sb.append(", catalogName=");
		sb.append(catalogName);
		sb.append(", sku=");
		sb.append(sku);
		sb.append(", programUrl=");
		sb.append(programUrl);
		sb.append(", lastUpdated=");
		sb.append(lastUpdated);
		sb.append(", name=");
		sb.append(name);
		sb.append(", keywords=");
		sb.append(keywords);
		sb.append(", description=");
		sb.append(description);
		sb.append(", manufacturer=");
		sb.append(manufacturer);
		sb.append(", manufacturerId=");
		sb.append(manufacturerId);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", price=");
		sb.append(price);
		sb.append(", buyUrl=");
		sb.append(buyUrl);
		sb.append(", impressionUrl=");
		sb.append(impressionUrl);
		sb.append(", imageUrl=");
		sb.append(imageUrl);
		sb.append(", inStock=");
		sb.append(inStock);
		sb.append(", viewCount=");
		sb.append(viewCount);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", subtitle=");
		sb.append(subtitle);
		sb.append(", urlTitle=");
		sb.append(urlTitle);
		sb.append(", content=");
		sb.append(content);
		sb.append(", displayDate=");
		sb.append(displayDate);
		sb.append(", coverImageCaption=");
		sb.append(coverImageCaption);
		sb.append(", coverImageFileEntryId=");
		sb.append(coverImageFileEntryId);
		sb.append(", coverImageURL=");
		sb.append(coverImageURL);
		sb.append(", smallImage=");
		sb.append(smallImage);
		sb.append(", smallImageFileEntryId=");
		sb.append(smallImageFileEntryId);
		sb.append(", smallImageId=");
		sb.append(smallImageId);
		sb.append(", smallImageURL=");
		sb.append(smallImageURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CJProduct toEntityModel() {
		CJProductImpl cjProductImpl = new CJProductImpl();

		if (uuid == null) {
			cjProductImpl.setUuid(StringPool.BLANK);
		}
		else {
			cjProductImpl.setUuid(uuid);
		}

		cjProductImpl.setProductId(productId);
		cjProductImpl.setGroupId(groupId);
		cjProductImpl.setCompanyId(companyId);
		cjProductImpl.setUserId(userId);

		if (userName == null) {
			cjProductImpl.setUserName(StringPool.BLANK);
		}
		else {
			cjProductImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cjProductImpl.setCreateDate(null);
		}
		else {
			cjProductImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cjProductImpl.setModifiedDate(null);
		}
		else {
			cjProductImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (programName == null) {
			cjProductImpl.setProgramName(StringPool.BLANK);
		}
		else {
			cjProductImpl.setProgramName(programName);
		}

		if (catalogName == null) {
			cjProductImpl.setCatalogName(StringPool.BLANK);
		}
		else {
			cjProductImpl.setCatalogName(catalogName);
		}

		if (sku == null) {
			cjProductImpl.setSku(StringPool.BLANK);
		}
		else {
			cjProductImpl.setSku(sku);
		}

		if (programUrl == null) {
			cjProductImpl.setProgramUrl(StringPool.BLANK);
		}
		else {
			cjProductImpl.setProgramUrl(programUrl);
		}

		if (lastUpdated == null) {
			cjProductImpl.setLastUpdated(StringPool.BLANK);
		}
		else {
			cjProductImpl.setLastUpdated(lastUpdated);
		}

		if (name == null) {
			cjProductImpl.setName(StringPool.BLANK);
		}
		else {
			cjProductImpl.setName(name);
		}

		if (keywords == null) {
			cjProductImpl.setKeywords(StringPool.BLANK);
		}
		else {
			cjProductImpl.setKeywords(keywords);
		}

		if (description == null) {
			cjProductImpl.setDescription(StringPool.BLANK);
		}
		else {
			cjProductImpl.setDescription(description);
		}

		if (manufacturer == null) {
			cjProductImpl.setManufacturer(StringPool.BLANK);
		}
		else {
			cjProductImpl.setManufacturer(manufacturer);
		}

		if (manufacturerId == null) {
			cjProductImpl.setManufacturerId(StringPool.BLANK);
		}
		else {
			cjProductImpl.setManufacturerId(manufacturerId);
		}

		if (currency == null) {
			cjProductImpl.setCurrency(StringPool.BLANK);
		}
		else {
			cjProductImpl.setCurrency(currency);
		}

		if (price == null) {
			cjProductImpl.setPrice(StringPool.BLANK);
		}
		else {
			cjProductImpl.setPrice(price);
		}

		if (buyUrl == null) {
			cjProductImpl.setBuyUrl(StringPool.BLANK);
		}
		else {
			cjProductImpl.setBuyUrl(buyUrl);
		}

		if (impressionUrl == null) {
			cjProductImpl.setImpressionUrl(StringPool.BLANK);
		}
		else {
			cjProductImpl.setImpressionUrl(impressionUrl);
		}

		if (imageUrl == null) {
			cjProductImpl.setImageUrl(StringPool.BLANK);
		}
		else {
			cjProductImpl.setImageUrl(imageUrl);
		}

		if (inStock == null) {
			cjProductImpl.setInStock(StringPool.BLANK);
		}
		else {
			cjProductImpl.setInStock(inStock);
		}

		cjProductImpl.setViewCount(viewCount);
		cjProductImpl.setStatus(status);
		cjProductImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			cjProductImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			cjProductImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			cjProductImpl.setStatusDate(null);
		}
		else {
			cjProductImpl.setStatusDate(new Date(statusDate));
		}

		if (subtitle == null) {
			cjProductImpl.setSubtitle(StringPool.BLANK);
		}
		else {
			cjProductImpl.setSubtitle(subtitle);
		}

		if (urlTitle == null) {
			cjProductImpl.setUrlTitle(StringPool.BLANK);
		}
		else {
			cjProductImpl.setUrlTitle(urlTitle);
		}

		if (content == null) {
			cjProductImpl.setContent(StringPool.BLANK);
		}
		else {
			cjProductImpl.setContent(content);
		}

		if (displayDate == Long.MIN_VALUE) {
			cjProductImpl.setDisplayDate(null);
		}
		else {
			cjProductImpl.setDisplayDate(new Date(displayDate));
		}

		if (coverImageCaption == null) {
			cjProductImpl.setCoverImageCaption(StringPool.BLANK);
		}
		else {
			cjProductImpl.setCoverImageCaption(coverImageCaption);
		}

		cjProductImpl.setCoverImageFileEntryId(coverImageFileEntryId);

		if (coverImageURL == null) {
			cjProductImpl.setCoverImageURL(StringPool.BLANK);
		}
		else {
			cjProductImpl.setCoverImageURL(coverImageURL);
		}

		cjProductImpl.setSmallImage(smallImage);
		cjProductImpl.setSmallImageFileEntryId(smallImageFileEntryId);
		cjProductImpl.setSmallImageId(smallImageId);

		if (smallImageURL == null) {
			cjProductImpl.setSmallImageURL(StringPool.BLANK);
		}
		else {
			cjProductImpl.setSmallImageURL(smallImageURL);
		}

		cjProductImpl.resetOriginalValues();

		return cjProductImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		productId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		programName = objectInput.readUTF();
		catalogName = objectInput.readUTF();
		sku = objectInput.readUTF();
		programUrl = objectInput.readUTF();
		lastUpdated = objectInput.readUTF();
		name = objectInput.readUTF();
		keywords = objectInput.readUTF();
		description = objectInput.readUTF();
		manufacturer = objectInput.readUTF();
		manufacturerId = objectInput.readUTF();
		currency = objectInput.readUTF();
		price = objectInput.readUTF();
		buyUrl = objectInput.readUTF();
		impressionUrl = objectInput.readUTF();
		imageUrl = objectInput.readUTF();
		inStock = objectInput.readUTF();

		viewCount = objectInput.readInt();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		subtitle = objectInput.readUTF();
		urlTitle = objectInput.readUTF();
		content = objectInput.readUTF();
		displayDate = objectInput.readLong();
		coverImageCaption = objectInput.readUTF();

		coverImageFileEntryId = objectInput.readLong();
		coverImageURL = objectInput.readUTF();

		smallImage = objectInput.readBoolean();

		smallImageFileEntryId = objectInput.readLong();

		smallImageId = objectInput.readLong();
		smallImageURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(productId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (programName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(programName);
		}

		if (catalogName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(catalogName);
		}

		if (sku == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sku);
		}

		if (programUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(programUrl);
		}

		if (lastUpdated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastUpdated);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (keywords == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(keywords);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (manufacturer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturer);
		}

		if (manufacturerId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(manufacturerId);
		}

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		if (buyUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(buyUrl);
		}

		if (impressionUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(impressionUrl);
		}

		if (imageUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageUrl);
		}

		if (inStock == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inStock);
		}

		objectOutput.writeInt(viewCount);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (subtitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subtitle);
		}

		if (urlTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(urlTitle);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(displayDate);

		if (coverImageCaption == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coverImageCaption);
		}

		objectOutput.writeLong(coverImageFileEntryId);

		if (coverImageURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coverImageURL);
		}

		objectOutput.writeBoolean(smallImage);

		objectOutput.writeLong(smallImageFileEntryId);

		objectOutput.writeLong(smallImageId);

		if (smallImageURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(smallImageURL);
		}
	}

	public String uuid;
	public long productId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String programName;
	public String catalogName;
	public String sku;
	public String programUrl;
	public String lastUpdated;
	public String name;
	public String keywords;
	public String description;
	public String manufacturer;
	public String manufacturerId;
	public String currency;
	public String price;
	public String buyUrl;
	public String impressionUrl;
	public String imageUrl;
	public String inStock;
	public int viewCount;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String subtitle;
	public String urlTitle;
	public String content;
	public long displayDate;
	public String coverImageCaption;
	public long coverImageFileEntryId;
	public String coverImageURL;
	public boolean smallImage;
	public long smallImageFileEntryId;
	public long smallImageId;
	public String smallImageURL;
}