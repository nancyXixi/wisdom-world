<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css" type="text/css" />
</head>
<body>
	<div id="main">
		<div class="newcontainer" id="course_intro">
			<table width="40%">
				<tr>
					<td>编号</td>
					<td>姓名</td>
					<td>年龄</td>
				</tr>
				<c:forEach var="user" items="${users}" varStatus="st">
					<tr>
						<td>${st.index+1}</td>
						<td>${user.userName}</td>
						<td>${user.age}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>