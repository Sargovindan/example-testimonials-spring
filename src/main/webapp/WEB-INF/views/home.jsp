<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp" %>
<jsp:include page="layout/header.jsp">
	<jsp:param value="Welcome page" name="title"/>
	<jsp:param value="home" name="page"/>
</jsp:include>

<h1>Just a simple application for collecting testimonials</h1>

<p>This project is to showcase Spring, Spring Web MVC, JSPs, JSTL, DataTables and iText. Based on
	Maven, Hibernate, HSQLDB and Twitter Bootstrap.</p>

<p>This project contains embedded HSQL database, which destroys all
	data at shutdown. If you want different database, add JDBC driver to
	pom.xml and change META-INF/persistence.xml.</p>

<p>Demo testimonials will be re-initialized once per day, any other testimonials will be deleted. </p>


<jsp:include page="layout/footer.jsp" />