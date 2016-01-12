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
		  <form action="<%= request.getContextPath()%>/user/save" method="post">
			  <c:if test="${not empty info.userId}">
			  	<input name="userId" type="hidden" value="${info.userId}">
			  </c:if>
		    <div>
		       <span>姓名:</span><input type="text" id="userName" name="userName" value="${info.userName}">
		    </div>
		    <div>
		       <span>age:</span><input type="text" id="age" name="age" value="${info.age}">
		    </div>
		    <div>
		       <input type="submit" id="btnPass" value="提交" />
		    </div> 
		  </form>
		</div>
	</div>
</body>
</html>