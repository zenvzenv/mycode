<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fmt.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	Date date=new Date();
    	request.setAttribute("date", date);
    %>
    <fmt:formatDate value="${requestScope.date }" pattern="yyyy-MM-dd HH:mm:ss"/>
    <br/>
    <%
    	double PI=3.1415926;
    	request.setAttribute("PI", PI);
    %>
    <fmt:formatNumber value="${requestScope.PI }" pattern="0.00"></fmt:formatNumber><br/>
    <fmt:formatNumber value="${requestScope.PI }" pattern="#.##"></fmt:formatNumber>
  </body>
</html>
