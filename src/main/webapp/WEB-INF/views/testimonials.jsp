<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="testimonials" name="page"/>
	<jsp:param value="all testimonials" name="title"/>
</jsp:include>

<script type="text/javascript">
	$(document).ready(function() {
		var oTable = $('#example').dataTable( {
	        "bProcessing": true,
	        "sAjaxSource": "testimonials/list.json",
	        "aoColumns": [
	                      { "mData": "date" },
	                      { "mData": "name" },
	                      { "mData": "pdf" }
	        ]
	    } );
	});
</script>

<table class="display" id="example">
	<thead>
		<tr>
			<th>Date</th>
			<th>Name</th>
			<th>Pdf</th>
		</tr>
	</thead>
	<tbody>
		
	</tbody>
</table>
<jsp:include page="layout/footer.jsp" />
