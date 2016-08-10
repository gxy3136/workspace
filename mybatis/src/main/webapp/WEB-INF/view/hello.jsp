<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	text-align: center;
	border-collapse: collapse;
	border: none;
	border-collapse: collapse;
	border-collapse: collapse;
	border: none;
}

td {
	padding: 5px 10px;
	border: solid #add9c0 1px;
}

.line {
	height: 10px;
}
</style>
</head>
<body>
	${hello}
	<div class="line"></div>
	<c:if test="${demos != null}">
		<table>
			<tbody>
				<tr>
					<td>No.</td>
					<td>Content</td>
				</tr>
				<tr>
					<c:forEach items="${demos}" var="demo">
						<tr>
							<td><c:out value="${demo.id}"></c:out></td>
							<td><c:out value="${demo.content}"></c:out></td>
						</tr>
					</c:forEach>
				</tr>
			</tbody>
		</table>
	</c:if>
	<div class="line"></div>
	<button onclick="history.go(-1)">Back</button>
</body>
</html>