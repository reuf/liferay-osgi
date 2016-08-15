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

import ca.efendi.datafeeds.model.FtpSubscription;
import ca.efendi.datafeeds.model.FtpSubscriptionModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FtpSubscription service. Represents a row in the &quot;cafe_FtpSubscription&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FtpSubscriptionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FtpSubscriptionImpl}.
 * </p>
 *
 * @author fefendi
 * @see FtpSubscriptionImpl
 * @see FtpSubscription
 * @see FtpSubscriptionModel
 * @generated
 */
@ProviderType
public class FtpSubscriptionModelImpl extends BaseModelImpl<FtpSubscription>
	implements FtpSubscriptionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ftp subscription model instance should use the {@link FtpSubscription} interface instead.
	 */
	public static final String TABLE_NAME = "cafe_FtpSubscription";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ftpSubscriptionId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "ftpHost", Types.VARCHAR },
			{ "ftpUser", Types.VARCHAR },
			{ "ftpPassword", Types.VARCHAR },
			{ "ftpFolder", Types.VARCHAR },
			{ "ftpFile", Types.VARCHAR },
			{ "ftpDatafeedName", Types.VARCHAR },
			{ "ftpDatafeedDescription", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ftpSubscriptionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ftpHost", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpPassword", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpFolder", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpFile", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpDatafeedName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ftpDatafeedDescription", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table cafe_FtpSubscription (ftpSubscriptionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,ftpHost VARCHAR(75) null,ftpUser VARCHAR(75) null,ftpPassword VARCHAR(75) null,ftpFolder VARCHAR(75) null,ftpFile VARCHAR(75) null,ftpDatafeedName VARCHAR(75) null,ftpDatafeedDescription VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table cafe_FtpSubscription";
	public static final String ORDER_BY_JPQL = " ORDER BY ftpSubscription.ftpSubscriptionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cafe_FtpSubscription.ftpSubscriptionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ca.efendi.datafeeds.service.util.PropsUtil.get(
				"value.object.entity.cache.enabled.ca.efendi.datafeeds.model.FtpSubscription"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ca.efendi.datafeeds.service.util.PropsUtil.get(
				"value.object.finder.cache.enabled.ca.efendi.datafeeds.model.FtpSubscription"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ca.efendi.datafeeds.service.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.ca.efendi.datafeeds.model.FtpSubscription"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long FTPSUBSCRIPTIONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ca.efendi.datafeeds.service.util.PropsUtil.get(
				"lock.expiration.time.ca.efendi.datafeeds.model.FtpSubscription"));

	public FtpSubscriptionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ftpSubscriptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFtpSubscriptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ftpSubscriptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FtpSubscription.class;
	}

	@Override
	public String getModelClassName() {
		return FtpSubscription.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ftpSubscriptionId", getFtpSubscriptionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ftpHost", getFtpHost());
		attributes.put("ftpUser", getFtpUser());
		attributes.put("ftpPassword", getFtpPassword());
		attributes.put("ftpFolder", getFtpFolder());
		attributes.put("ftpFile", getFtpFile());
		attributes.put("ftpDatafeedName", getFtpDatafeedName());
		attributes.put("ftpDatafeedDescription", getFtpDatafeedDescription());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ftpSubscriptionId = (Long)attributes.get("ftpSubscriptionId");

		if (ftpSubscriptionId != null) {
			setFtpSubscriptionId(ftpSubscriptionId);
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

		String ftpHost = (String)attributes.get("ftpHost");

		if (ftpHost != null) {
			setFtpHost(ftpHost);
		}

		String ftpUser = (String)attributes.get("ftpUser");

		if (ftpUser != null) {
			setFtpUser(ftpUser);
		}

		String ftpPassword = (String)attributes.get("ftpPassword");

		if (ftpPassword != null) {
			setFtpPassword(ftpPassword);
		}

		String ftpFolder = (String)attributes.get("ftpFolder");

		if (ftpFolder != null) {
			setFtpFolder(ftpFolder);
		}

		String ftpFile = (String)attributes.get("ftpFile");

		if (ftpFile != null) {
			setFtpFile(ftpFile);
		}

		String ftpDatafeedName = (String)attributes.get("ftpDatafeedName");

		if (ftpDatafeedName != null) {
			setFtpDatafeedName(ftpDatafeedName);
		}

		String ftpDatafeedDescription = (String)attributes.get(
				"ftpDatafeedDescription");

		if (ftpDatafeedDescription != null) {
			setFtpDatafeedDescription(ftpDatafeedDescription);
		}
	}

	@Override
	public long getFtpSubscriptionId() {
		return _ftpSubscriptionId;
	}

	@Override
	public void setFtpSubscriptionId(long ftpSubscriptionId) {
		_ftpSubscriptionId = ftpSubscriptionId;
	}

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

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

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
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

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

	@Override
	public String getFtpHost() {
		if (_ftpHost == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpHost;
		}
	}

	@Override
	public void setFtpHost(String ftpHost) {
		_ftpHost = ftpHost;
	}

	@Override
	public String getFtpUser() {
		if (_ftpUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpUser;
		}
	}

	@Override
	public void setFtpUser(String ftpUser) {
		_ftpUser = ftpUser;
	}

	@Override
	public String getFtpPassword() {
		if (_ftpPassword == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpPassword;
		}
	}

	@Override
	public void setFtpPassword(String ftpPassword) {
		_ftpPassword = ftpPassword;
	}

	@Override
	public String getFtpFolder() {
		if (_ftpFolder == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpFolder;
		}
	}

	@Override
	public void setFtpFolder(String ftpFolder) {
		_ftpFolder = ftpFolder;
	}

	@Override
	public String getFtpFile() {
		if (_ftpFile == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpFile;
		}
	}

	@Override
	public void setFtpFile(String ftpFile) {
		_ftpFile = ftpFile;
	}

	@Override
	public String getFtpDatafeedName() {
		if (_ftpDatafeedName == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpDatafeedName;
		}
	}

	@Override
	public void setFtpDatafeedName(String ftpDatafeedName) {
		_ftpDatafeedName = ftpDatafeedName;
	}

	@Override
	public String getFtpDatafeedDescription() {
		if (_ftpDatafeedDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _ftpDatafeedDescription;
		}
	}

	@Override
	public void setFtpDatafeedDescription(String ftpDatafeedDescription) {
		_ftpDatafeedDescription = ftpDatafeedDescription;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			FtpSubscription.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FtpSubscription toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FtpSubscription)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FtpSubscriptionImpl ftpSubscriptionImpl = new FtpSubscriptionImpl();

		ftpSubscriptionImpl.setFtpSubscriptionId(getFtpSubscriptionId());
		ftpSubscriptionImpl.setGroupId(getGroupId());
		ftpSubscriptionImpl.setCompanyId(getCompanyId());
		ftpSubscriptionImpl.setUserId(getUserId());
		ftpSubscriptionImpl.setUserName(getUserName());
		ftpSubscriptionImpl.setCreateDate(getCreateDate());
		ftpSubscriptionImpl.setModifiedDate(getModifiedDate());
		ftpSubscriptionImpl.setFtpHost(getFtpHost());
		ftpSubscriptionImpl.setFtpUser(getFtpUser());
		ftpSubscriptionImpl.setFtpPassword(getFtpPassword());
		ftpSubscriptionImpl.setFtpFolder(getFtpFolder());
		ftpSubscriptionImpl.setFtpFile(getFtpFile());
		ftpSubscriptionImpl.setFtpDatafeedName(getFtpDatafeedName());
		ftpSubscriptionImpl.setFtpDatafeedDescription(getFtpDatafeedDescription());

		ftpSubscriptionImpl.resetOriginalValues();

		return ftpSubscriptionImpl;
	}

	@Override
	public int compareTo(FtpSubscription ftpSubscription) {
		long primaryKey = ftpSubscription.getPrimaryKey();

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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FtpSubscription)) {
			return false;
		}

		FtpSubscription ftpSubscription = (FtpSubscription)obj;

		long primaryKey = ftpSubscription.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		FtpSubscriptionModelImpl ftpSubscriptionModelImpl = this;

		ftpSubscriptionModelImpl._originalGroupId = ftpSubscriptionModelImpl._groupId;

		ftpSubscriptionModelImpl._setOriginalGroupId = false;

		ftpSubscriptionModelImpl._setModifiedDate = false;

		ftpSubscriptionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FtpSubscription> toCacheModel() {
		FtpSubscriptionCacheModel ftpSubscriptionCacheModel = new FtpSubscriptionCacheModel();

		ftpSubscriptionCacheModel.ftpSubscriptionId = getFtpSubscriptionId();

		ftpSubscriptionCacheModel.groupId = getGroupId();

		ftpSubscriptionCacheModel.companyId = getCompanyId();

		ftpSubscriptionCacheModel.userId = getUserId();

		ftpSubscriptionCacheModel.userName = getUserName();

		String userName = ftpSubscriptionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ftpSubscriptionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ftpSubscriptionCacheModel.createDate = createDate.getTime();
		}
		else {
			ftpSubscriptionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ftpSubscriptionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ftpSubscriptionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ftpSubscriptionCacheModel.ftpHost = getFtpHost();

		String ftpHost = ftpSubscriptionCacheModel.ftpHost;

		if ((ftpHost != null) && (ftpHost.length() == 0)) {
			ftpSubscriptionCacheModel.ftpHost = null;
		}

		ftpSubscriptionCacheModel.ftpUser = getFtpUser();

		String ftpUser = ftpSubscriptionCacheModel.ftpUser;

		if ((ftpUser != null) && (ftpUser.length() == 0)) {
			ftpSubscriptionCacheModel.ftpUser = null;
		}

		ftpSubscriptionCacheModel.ftpPassword = getFtpPassword();

		String ftpPassword = ftpSubscriptionCacheModel.ftpPassword;

		if ((ftpPassword != null) && (ftpPassword.length() == 0)) {
			ftpSubscriptionCacheModel.ftpPassword = null;
		}

		ftpSubscriptionCacheModel.ftpFolder = getFtpFolder();

		String ftpFolder = ftpSubscriptionCacheModel.ftpFolder;

		if ((ftpFolder != null) && (ftpFolder.length() == 0)) {
			ftpSubscriptionCacheModel.ftpFolder = null;
		}

		ftpSubscriptionCacheModel.ftpFile = getFtpFile();

		String ftpFile = ftpSubscriptionCacheModel.ftpFile;

		if ((ftpFile != null) && (ftpFile.length() == 0)) {
			ftpSubscriptionCacheModel.ftpFile = null;
		}

		ftpSubscriptionCacheModel.ftpDatafeedName = getFtpDatafeedName();

		String ftpDatafeedName = ftpSubscriptionCacheModel.ftpDatafeedName;

		if ((ftpDatafeedName != null) && (ftpDatafeedName.length() == 0)) {
			ftpSubscriptionCacheModel.ftpDatafeedName = null;
		}

		ftpSubscriptionCacheModel.ftpDatafeedDescription = getFtpDatafeedDescription();

		String ftpDatafeedDescription = ftpSubscriptionCacheModel.ftpDatafeedDescription;

		if ((ftpDatafeedDescription != null) &&
				(ftpDatafeedDescription.length() == 0)) {
			ftpSubscriptionCacheModel.ftpDatafeedDescription = null;
		}

		return ftpSubscriptionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ftpSubscriptionId=");
		sb.append(getFtpSubscriptionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", ftpHost=");
		sb.append(getFtpHost());
		sb.append(", ftpUser=");
		sb.append(getFtpUser());
		sb.append(", ftpPassword=");
		sb.append(getFtpPassword());
		sb.append(", ftpFolder=");
		sb.append(getFtpFolder());
		sb.append(", ftpFile=");
		sb.append(getFtpFile());
		sb.append(", ftpDatafeedName=");
		sb.append(getFtpDatafeedName());
		sb.append(", ftpDatafeedDescription=");
		sb.append(getFtpDatafeedDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("ca.efendi.datafeeds.model.FtpSubscription");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ftpSubscriptionId</column-name><column-value><![CDATA[");
		sb.append(getFtpSubscriptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpHost</column-name><column-value><![CDATA[");
		sb.append(getFtpHost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpUser</column-name><column-value><![CDATA[");
		sb.append(getFtpUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpPassword</column-name><column-value><![CDATA[");
		sb.append(getFtpPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpFolder</column-name><column-value><![CDATA[");
		sb.append(getFtpFolder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpFile</column-name><column-value><![CDATA[");
		sb.append(getFtpFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpDatafeedName</column-name><column-value><![CDATA[");
		sb.append(getFtpDatafeedName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ftpDatafeedDescription</column-name><column-value><![CDATA[");
		sb.append(getFtpDatafeedDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FtpSubscription.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FtpSubscription.class
		};
	private long _ftpSubscriptionId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _ftpHost;
	private String _ftpUser;
	private String _ftpPassword;
	private String _ftpFolder;
	private String _ftpFile;
	private String _ftpDatafeedName;
	private String _ftpDatafeedDescription;
	private long _columnBitmask;
	private FtpSubscription _escapedModel;
}