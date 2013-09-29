<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
	<jsp:param value="new" name="page"/>
	<jsp:param value="new / edit testimonial" name="title"/>
</jsp:include>

<form:form commandName="testimonial" cssClass="form-signin">
<c:choose>
	<c:when test="${param.id != null}">
		<h2 class="form-signin-heading">Edit testimonial</h2>
	</c:when>
	<c:otherwise>
		<h2 class="form-signin-heading">New testimonial</h2>
	</c:otherwise>
</c:choose>
<c:if test="${param.success == true}">
	<div class="alert alert-success">thank you for your input</div>
</c:if>
<form:input path="name" cssClass="form-control" placeholder="Name" /><br />

<form:textarea path="pluses" cssClass="form-control" placeholder="Pluses (what you liked)" /><br />

<form:textarea path="minuses" cssClass="form-control" placeholder="Minuses (what you disliked)" /><br />

<input type="submit" class="btn btn-lg btn-primary btn-block" />

</form:form>

<jsp:include page="layout/footer.jsp" />
