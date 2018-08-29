<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="cn.zw.domain.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'EL.jsp' starting page</title>
    
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
		Address address=new Address();
    	address.setCity("泗阳");
    	address.setStreet("文成东路");
    	
    	Employee emp=new Employee();
    	emp.setName("郑伟");
    	emp.setSalary(3000);
    	emp.setAddress(address);
    	
    	pageContext.setAttribute("emp", emp);
    	request.setAttribute("emp", emp);
    	
    	Employee employee=(Employee)request.getAttribute("emp");
    	String street=employee.getAddress().getStreet();
    	
	%>
    	${emp}<!-- 全域查找 --><br/>
    	${requestScope.emp.address.street}<br/><!-- 等同于requst.getAttribute("emp").getAddress().getStreet() -->
  </body>
</html>
