<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'succ2.jsp' starting page</title>
    
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
    	session=request.getSession();
    	String username=(String)session.getAttribute("username");
    	String password=(String)session.getAttribute("password");
    	if(username==null||password==null){
    		request.setAttribute("msg", "您还未登录，请登录！");
    		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
    	}
    %>
    <h1>欢迎<%=username %>登录！</h1>
  </body>
</html>
