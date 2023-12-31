<%@ include file="../init.jsp"%>

<c:set var="assignment" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

<%-- Assignment Options Menu --%>
<liferay-ui:icon-menu markupView="lexicon">
	<%-- View Individual or Selected Assignment --%>
	<c:if
		test="${assignmentPermission.contains(permissionChecker, assignment.assignmentId, 'VIEW' )}">
		<portlet:renderURL var="viewAssignmentURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.VIEW_ASSIGNMENT%>" />
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="assignmentId" value="${assignment.assignmentId}" />
		</portlet:renderURL>
		<liferay-ui:icon message="view" url="${viewAssignmentURL}" />
	</c:if>

	<%-- Edit Individual or Selected Assignment --%>
	<c:if
		test="${assignmentPermission.contains(permissionChecker, assignment.assignmentId, 'UPDATE' )}">
		<portlet:renderURL var="editAssignmentURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.EDIT_ASSIGNMENT%>" />
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="assignmentId" value="${assignment.assignmentId}" />
		</portlet:renderURL>
		<liferay-ui:icon message="edit" url="${editAssignmentURL}" />
		
	</c:if>

	<%-- Showing All The Associated Permission For Assignments --%>
	<c:if
		test="${assignmentPermission.contains(permissionChecker, assignment.assignmentId, 'PERMISSIONS' )}">
		<liferay-security:permissionsURL
			modelResource="com.liferay.training.gradebook.model.Assignment"
			modelResourceDescription="${assignment.getTitle(locale)}"
			resourcePrimKey="${assignment.assignmentId}" var="permissionsURL" />
		<liferay-ui:icon message="permissions" url="${permissionsURL}" />
	</c:if>

	<%-- Deleting Individual or Selected Assignment --%>
	<c:if
		test="${assignmentPermission.contains(permissionChecker, assignment.assignmentId, 'DELETE' )}">
		<portlet:actionURL name="<%=MVCCommandNames.DELETE_ASSIGNMENT%>"
			var="deleteAssignmentURL">
			<portlet:param name="redirect" value="${currentURL}" />
			<portlet:param name="assignmentId" value="${assignment.assignmentId}" />
		</portlet:actionURL>
		<%-- <liferay-ui:icon message="delete" url="${deleteAssignmentURL}" />
		 --%><clay:icon symbol="folder" />
	</c:if>
</liferay-ui:icon-menu>