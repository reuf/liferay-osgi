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

package ca.efendi.datafeeds.service.base;

import ca.efendi.datafeeds.model.CJProduct;
import ca.efendi.datafeeds.service.CJProductService;
import ca.efendi.datafeeds.service.persistence.CJProductPersistence;
import ca.efendi.datafeeds.service.persistence.FtpSubscriptionPersistence;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetLinkPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.CompanyPersistence;
import com.liferay.portal.kernel.service.persistence.GroupPersistence;
import com.liferay.portal.kernel.service.persistence.LayoutPersistence;
import com.liferay.portal.kernel.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.kernel.service.persistence.SubscriptionPersistence;
import com.liferay.portal.kernel.service.persistence.TicketPersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.service.persistence.WorkflowInstanceLinkPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.ratings.kernel.service.persistence.RatingsStatsPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the c j product remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ca.efendi.datafeeds.service.impl.CJProductServiceImpl}.
 * </p>
 *
 * @author fefendi
 * @see ca.efendi.datafeeds.service.impl.CJProductServiceImpl
 * @see ca.efendi.datafeeds.service.CJProductServiceUtil
 * @generated
 */
public abstract class CJProductServiceBaseImpl extends BaseServiceImpl
	implements CJProductService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ca.efendi.datafeeds.service.CJProductServiceUtil} to access the c j product remote service.
	 */

	/**
	 * Returns the c j product local service.
	 *
	 * @return the c j product local service
	 */
	public ca.efendi.datafeeds.service.CJProductLocalService getCJProductLocalService() {
		return cjProductLocalService;
	}

	/**
	 * Sets the c j product local service.
	 *
	 * @param cjProductLocalService the c j product local service
	 */
	public void setCJProductLocalService(
		ca.efendi.datafeeds.service.CJProductLocalService cjProductLocalService) {
		this.cjProductLocalService = cjProductLocalService;
	}

	/**
	 * Returns the c j product remote service.
	 *
	 * @return the c j product remote service
	 */
	public CJProductService getCJProductService() {
		return cjProductService;
	}

	/**
	 * Sets the c j product remote service.
	 *
	 * @param cjProductService the c j product remote service
	 */
	public void setCJProductService(CJProductService cjProductService) {
		this.cjProductService = cjProductService;
	}

	/**
	 * Returns the c j product persistence.
	 *
	 * @return the c j product persistence
	 */
	public CJProductPersistence getCJProductPersistence() {
		return cjProductPersistence;
	}

	/**
	 * Sets the c j product persistence.
	 *
	 * @param cjProductPersistence the c j product persistence
	 */
	public void setCJProductPersistence(
		CJProductPersistence cjProductPersistence) {
		this.cjProductPersistence = cjProductPersistence;
	}

	/**
	 * Returns the ftp subscription local service.
	 *
	 * @return the ftp subscription local service
	 */
	public ca.efendi.datafeeds.service.FtpSubscriptionLocalService getFtpSubscriptionLocalService() {
		return ftpSubscriptionLocalService;
	}

	/**
	 * Sets the ftp subscription local service.
	 *
	 * @param ftpSubscriptionLocalService the ftp subscription local service
	 */
	public void setFtpSubscriptionLocalService(
		ca.efendi.datafeeds.service.FtpSubscriptionLocalService ftpSubscriptionLocalService) {
		this.ftpSubscriptionLocalService = ftpSubscriptionLocalService;
	}

	/**
	 * Returns the ftp subscription persistence.
	 *
	 * @return the ftp subscription persistence
	 */
	public FtpSubscriptionPersistence getFtpSubscriptionPersistence() {
		return ftpSubscriptionPersistence;
	}

	/**
	 * Sets the ftp subscription persistence.
	 *
	 * @param ftpSubscriptionPersistence the ftp subscription persistence
	 */
	public void setFtpSubscriptionPersistence(
		FtpSubscriptionPersistence ftpSubscriptionPersistence) {
		this.ftpSubscriptionPersistence = ftpSubscriptionPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the company local service.
	 *
	 * @return the company local service
	 */
	public com.liferay.portal.kernel.service.CompanyLocalService getCompanyLocalService() {
		return companyLocalService;
	}

	/**
	 * Sets the company local service.
	 *
	 * @param companyLocalService the company local service
	 */
	public void setCompanyLocalService(
		com.liferay.portal.kernel.service.CompanyLocalService companyLocalService) {
		this.companyLocalService = companyLocalService;
	}

	/**
	 * Returns the company remote service.
	 *
	 * @return the company remote service
	 */
	public com.liferay.portal.kernel.service.CompanyService getCompanyService() {
		return companyService;
	}

	/**
	 * Sets the company remote service.
	 *
	 * @param companyService the company remote service
	 */
	public void setCompanyService(
		com.liferay.portal.kernel.service.CompanyService companyService) {
		this.companyService = companyService;
	}

	/**
	 * Returns the company persistence.
	 *
	 * @return the company persistence
	 */
	public CompanyPersistence getCompanyPersistence() {
		return companyPersistence;
	}

	/**
	 * Sets the company persistence.
	 *
	 * @param companyPersistence the company persistence
	 */
	public void setCompanyPersistence(CompanyPersistence companyPersistence) {
		this.companyPersistence = companyPersistence;
	}

	/**
	 * Returns the group local service.
	 *
	 * @return the group local service
	 */
	public com.liferay.portal.kernel.service.GroupLocalService getGroupLocalService() {
		return groupLocalService;
	}

	/**
	 * Sets the group local service.
	 *
	 * @param groupLocalService the group local service
	 */
	public void setGroupLocalService(
		com.liferay.portal.kernel.service.GroupLocalService groupLocalService) {
		this.groupLocalService = groupLocalService;
	}

	/**
	 * Returns the group remote service.
	 *
	 * @return the group remote service
	 */
	public com.liferay.portal.kernel.service.GroupService getGroupService() {
		return groupService;
	}

	/**
	 * Sets the group remote service.
	 *
	 * @param groupService the group remote service
	 */
	public void setGroupService(
		com.liferay.portal.kernel.service.GroupService groupService) {
		this.groupService = groupService;
	}

	/**
	 * Returns the group persistence.
	 *
	 * @return the group persistence
	 */
	public GroupPersistence getGroupPersistence() {
		return groupPersistence;
	}

	/**
	 * Sets the group persistence.
	 *
	 * @param groupPersistence the group persistence
	 */
	public void setGroupPersistence(GroupPersistence groupPersistence) {
		this.groupPersistence = groupPersistence;
	}

	/**
	 * Returns the layout local service.
	 *
	 * @return the layout local service
	 */
	public com.liferay.portal.kernel.service.LayoutLocalService getLayoutLocalService() {
		return layoutLocalService;
	}

	/**
	 * Sets the layout local service.
	 *
	 * @param layoutLocalService the layout local service
	 */
	public void setLayoutLocalService(
		com.liferay.portal.kernel.service.LayoutLocalService layoutLocalService) {
		this.layoutLocalService = layoutLocalService;
	}

	/**
	 * Returns the layout remote service.
	 *
	 * @return the layout remote service
	 */
	public com.liferay.portal.kernel.service.LayoutService getLayoutService() {
		return layoutService;
	}

	/**
	 * Sets the layout remote service.
	 *
	 * @param layoutService the layout remote service
	 */
	public void setLayoutService(
		com.liferay.portal.kernel.service.LayoutService layoutService) {
		this.layoutService = layoutService;
	}

	/**
	 * Returns the layout persistence.
	 *
	 * @return the layout persistence
	 */
	public LayoutPersistence getLayoutPersistence() {
		return layoutPersistence;
	}

	/**
	 * Sets the layout persistence.
	 *
	 * @param layoutPersistence the layout persistence
	 */
	public void setLayoutPersistence(LayoutPersistence layoutPersistence) {
		this.layoutPersistence = layoutPersistence;
	}

	/**
	 * Returns the portlet preferences local service.
	 *
	 * @return the portlet preferences local service
	 */
	public com.liferay.portal.kernel.service.PortletPreferencesLocalService getPortletPreferencesLocalService() {
		return portletPreferencesLocalService;
	}

	/**
	 * Sets the portlet preferences local service.
	 *
	 * @param portletPreferencesLocalService the portlet preferences local service
	 */
	public void setPortletPreferencesLocalService(
		com.liferay.portal.kernel.service.PortletPreferencesLocalService portletPreferencesLocalService) {
		this.portletPreferencesLocalService = portletPreferencesLocalService;
	}

	/**
	 * Returns the portlet preferences remote service.
	 *
	 * @return the portlet preferences remote service
	 */
	public com.liferay.portal.kernel.service.PortletPreferencesService getPortletPreferencesService() {
		return portletPreferencesService;
	}

	/**
	 * Sets the portlet preferences remote service.
	 *
	 * @param portletPreferencesService the portlet preferences remote service
	 */
	public void setPortletPreferencesService(
		com.liferay.portal.kernel.service.PortletPreferencesService portletPreferencesService) {
		this.portletPreferencesService = portletPreferencesService;
	}

	/**
	 * Returns the portlet preferences persistence.
	 *
	 * @return the portlet preferences persistence
	 */
	public PortletPreferencesPersistence getPortletPreferencesPersistence() {
		return portletPreferencesPersistence;
	}

	/**
	 * Sets the portlet preferences persistence.
	 *
	 * @param portletPreferencesPersistence the portlet preferences persistence
	 */
	public void setPortletPreferencesPersistence(
		PortletPreferencesPersistence portletPreferencesPersistence) {
		this.portletPreferencesPersistence = portletPreferencesPersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the subscription local service.
	 *
	 * @return the subscription local service
	 */
	public com.liferay.portal.kernel.service.SubscriptionLocalService getSubscriptionLocalService() {
		return subscriptionLocalService;
	}

	/**
	 * Sets the subscription local service.
	 *
	 * @param subscriptionLocalService the subscription local service
	 */
	public void setSubscriptionLocalService(
		com.liferay.portal.kernel.service.SubscriptionLocalService subscriptionLocalService) {
		this.subscriptionLocalService = subscriptionLocalService;
	}

	/**
	 * Returns the subscription persistence.
	 *
	 * @return the subscription persistence
	 */
	public SubscriptionPersistence getSubscriptionPersistence() {
		return subscriptionPersistence;
	}

	/**
	 * Sets the subscription persistence.
	 *
	 * @param subscriptionPersistence the subscription persistence
	 */
	public void setSubscriptionPersistence(
		SubscriptionPersistence subscriptionPersistence) {
		this.subscriptionPersistence = subscriptionPersistence;
	}

	/**
	 * Returns the ticket local service.
	 *
	 * @return the ticket local service
	 */
	public com.liferay.portal.kernel.service.TicketLocalService getTicketLocalService() {
		return ticketLocalService;
	}

	/**
	 * Sets the ticket local service.
	 *
	 * @param ticketLocalService the ticket local service
	 */
	public void setTicketLocalService(
		com.liferay.portal.kernel.service.TicketLocalService ticketLocalService) {
		this.ticketLocalService = ticketLocalService;
	}

	/**
	 * Returns the ticket persistence.
	 *
	 * @return the ticket persistence
	 */
	public TicketPersistence getTicketPersistence() {
		return ticketPersistence;
	}

	/**
	 * Sets the ticket persistence.
	 *
	 * @param ticketPersistence the ticket persistence
	 */
	public void setTicketPersistence(TicketPersistence ticketPersistence) {
		this.ticketPersistence = ticketPersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the workflow instance link local service.
	 *
	 * @return the workflow instance link local service
	 */
	public com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService getWorkflowInstanceLinkLocalService() {
		return workflowInstanceLinkLocalService;
	}

	/**
	 * Sets the workflow instance link local service.
	 *
	 * @param workflowInstanceLinkLocalService the workflow instance link local service
	 */
	public void setWorkflowInstanceLinkLocalService(
		com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService) {
		this.workflowInstanceLinkLocalService = workflowInstanceLinkLocalService;
	}

	/**
	 * Returns the workflow instance link persistence.
	 *
	 * @return the workflow instance link persistence
	 */
	public WorkflowInstanceLinkPersistence getWorkflowInstanceLinkPersistence() {
		return workflowInstanceLinkPersistence;
	}

	/**
	 * Sets the workflow instance link persistence.
	 *
	 * @param workflowInstanceLinkPersistence the workflow instance link persistence
	 */
	public void setWorkflowInstanceLinkPersistence(
		WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence) {
		this.workflowInstanceLinkPersistence = workflowInstanceLinkPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.asset.kernel.service.AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.asset.kernel.service.AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset link local service.
	 *
	 * @return the asset link local service
	 */
	public com.liferay.asset.kernel.service.AssetLinkLocalService getAssetLinkLocalService() {
		return assetLinkLocalService;
	}

	/**
	 * Sets the asset link local service.
	 *
	 * @param assetLinkLocalService the asset link local service
	 */
	public void setAssetLinkLocalService(
		com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService) {
		this.assetLinkLocalService = assetLinkLocalService;
	}

	/**
	 * Returns the asset link persistence.
	 *
	 * @return the asset link persistence
	 */
	public AssetLinkPersistence getAssetLinkPersistence() {
		return assetLinkPersistence;
	}

	/**
	 * Sets the asset link persistence.
	 *
	 * @param assetLinkPersistence the asset link persistence
	 */
	public void setAssetLinkPersistence(
		AssetLinkPersistence assetLinkPersistence) {
		this.assetLinkPersistence = assetLinkPersistence;
	}

	/**
	 * Returns the ratings stats local service.
	 *
	 * @return the ratings stats local service
	 */
	public com.liferay.ratings.kernel.service.RatingsStatsLocalService getRatingsStatsLocalService() {
		return ratingsStatsLocalService;
	}

	/**
	 * Sets the ratings stats local service.
	 *
	 * @param ratingsStatsLocalService the ratings stats local service
	 */
	public void setRatingsStatsLocalService(
		com.liferay.ratings.kernel.service.RatingsStatsLocalService ratingsStatsLocalService) {
		this.ratingsStatsLocalService = ratingsStatsLocalService;
	}

	/**
	 * Returns the ratings stats persistence.
	 *
	 * @return the ratings stats persistence
	 */
	public RatingsStatsPersistence getRatingsStatsPersistence() {
		return ratingsStatsPersistence;
	}

	/**
	 * Sets the ratings stats persistence.
	 *
	 * @param ratingsStatsPersistence the ratings stats persistence
	 */
	public void setRatingsStatsPersistence(
		RatingsStatsPersistence ratingsStatsPersistence) {
		this.ratingsStatsPersistence = ratingsStatsPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CJProductService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CJProduct.class;
	}

	protected String getModelClassName() {
		return CJProduct.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cjProductPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ca.efendi.datafeeds.service.CJProductLocalService.class)
	protected ca.efendi.datafeeds.service.CJProductLocalService cjProductLocalService;
	@BeanReference(type = CJProductService.class)
	protected CJProductService cjProductService;
	@BeanReference(type = CJProductPersistence.class)
	protected CJProductPersistence cjProductPersistence;
	@BeanReference(type = ca.efendi.datafeeds.service.FtpSubscriptionLocalService.class)
	protected ca.efendi.datafeeds.service.FtpSubscriptionLocalService ftpSubscriptionLocalService;
	@BeanReference(type = FtpSubscriptionPersistence.class)
	protected FtpSubscriptionPersistence ftpSubscriptionPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.CompanyLocalService.class)
	protected com.liferay.portal.kernel.service.CompanyLocalService companyLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.CompanyService.class)
	protected com.liferay.portal.kernel.service.CompanyService companyService;
	@ServiceReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.GroupLocalService.class)
	protected com.liferay.portal.kernel.service.GroupLocalService groupLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.GroupService.class)
	protected com.liferay.portal.kernel.service.GroupService groupService;
	@ServiceReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.LayoutLocalService.class)
	protected com.liferay.portal.kernel.service.LayoutLocalService layoutLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.LayoutService.class)
	protected com.liferay.portal.kernel.service.LayoutService layoutService;
	@ServiceReference(type = LayoutPersistence.class)
	protected LayoutPersistence layoutPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.PortletPreferencesLocalService.class)
	protected com.liferay.portal.kernel.service.PortletPreferencesLocalService portletPreferencesLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.PortletPreferencesService.class)
	protected com.liferay.portal.kernel.service.PortletPreferencesService portletPreferencesService;
	@ServiceReference(type = PortletPreferencesPersistence.class)
	protected PortletPreferencesPersistence portletPreferencesPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.SubscriptionLocalService.class)
	protected com.liferay.portal.kernel.service.SubscriptionLocalService subscriptionLocalService;
	@ServiceReference(type = SubscriptionPersistence.class)
	protected SubscriptionPersistence subscriptionPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.TicketLocalService.class)
	protected com.liferay.portal.kernel.service.TicketLocalService ticketLocalService;
	@ServiceReference(type = TicketPersistence.class)
	protected TicketPersistence ticketPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService.class)
	protected com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService;
	@ServiceReference(type = WorkflowInstanceLinkPersistence.class)
	protected WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryLocalService.class)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryService.class)
	protected com.liferay.asset.kernel.service.AssetEntryService assetEntryService;
	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetLinkLocalService.class)
	protected com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService;
	@ServiceReference(type = AssetLinkPersistence.class)
	protected AssetLinkPersistence assetLinkPersistence;
	@ServiceReference(type = com.liferay.ratings.kernel.service.RatingsStatsLocalService.class)
	protected com.liferay.ratings.kernel.service.RatingsStatsLocalService ratingsStatsLocalService;
	@ServiceReference(type = RatingsStatsPersistence.class)
	protected RatingsStatsPersistence ratingsStatsPersistence;
}