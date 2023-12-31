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

package com.liferay.training.gradebook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssignmentService}.
 *
 * @author hgrahul
 * @see AssignmentService
 * @generated
 */
public class AssignmentServiceWrapper
	implements AssignmentService, ServiceWrapper<AssignmentService> {

	public AssignmentServiceWrapper() {
		this(null);
	}

	public AssignmentServiceWrapper(AssignmentService assignmentService) {
		_assignmentService = assignmentService;
	}

	/**
	 * The behavior would be executed whenever request for Adding a New Assignment (Remote or Webservice Call)
	 *
	 * @param groupId
	 * @param titleMap
	 * @param descriptionMap
	 * @param dueDate
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Override
	public com.liferay.training.gradebook.model.Assignment addAssignment(
			long groupId, java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentService.addAssignment(
			groupId, titleMap, descriptionMap, dueDate, serviceContext);
	}

	@Override
	public com.liferay.training.gradebook.model.Assignment deleteAssignment(
			long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentService.deleteAssignment(assignmentId);
	}

	@Override
	public com.liferay.training.gradebook.model.Assignment getAssignment(
			long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentService.getAssignment(assignmentId);
	}

	@Override
	public java.util.List<com.liferay.training.gradebook.model.Assignment>
		getAssignmentsByGroupId(long groupId) {

		return _assignmentService.getAssignmentsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.training.gradebook.model.Assignment>
		getAssignmentsByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.gradebook.model.Assignment>
					orderByComparator) {

		return _assignmentService.getAssignmentsByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public long getAssignmentsCountByKeywords(long groupId, String keywords) {
		return _assignmentService.getAssignmentsCountByKeywords(
			groupId, keywords);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assignmentService.getOSGiServiceIdentifier();
	}

	/**
	 * The behavior would be executed whenever request for Updating An Existing Assignment (Remote or Webservice Call)
	 *
	 * @param assignmentId
	 * @param titleMap
	 * @param descriptionMap
	 * @param dueDate
	 * @param serviceContext
	 * @return
	 * @throws PortalException
	 */
	@Override
	public com.liferay.training.gradebook.model.Assignment updateAssignment(
			long assignmentId, java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			java.util.Date dueDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentService.updateAssignment(
			assignmentId, titleMap, descriptionMap, dueDate, serviceContext);
	}

	@Override
	public AssignmentService getWrappedService() {
		return _assignmentService;
	}

	@Override
	public void setWrappedService(AssignmentService assignmentService) {
		_assignmentService = assignmentService;
	}

	private AssignmentService _assignmentService;

}