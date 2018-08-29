<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  	String username="";
  	Cookie[] cookies=request.getCookies();
  	if(cookies!=null){
  		for(Cookie cookie:cookies){
  			if("username".equals(cookie.getName())){
  				username=cookie.getValue();
  			}
  		}
  	}
  %>
  
  <%
  	String message="";
  	String msg=(String)request.getAttribute("msg");
  	if(msg==null){
  		message="";
  	}else{
  		message=msg;
  	}
  %>
  	<h1>登录</h1>
  	<%=message %>
    <form action="/JSP/LoginServlet" method="post">
    	用户名:<input type="text" name="username" value="<%=username %>"/><br/>
    	密    码:<input type="password" name="password"/><br/>
    	验证码:<input type="text" name="verifycode"/>
    		 <img src="/JSP/VerifyCodeServlet" id="img"/>
    		 <a href="javascript:changeImg()">换一张</a>
    		 <br/>
    	<input type="submit" value="登录"/>
    </form>
  </body>
  <script type="text/javascript">
  	function changeImg(){
  		var date=new Date();
  		var imgElement=document.getElementById("img");
  		imgElement.src="/JSP/VerifyCodeServlet?a"+date.getTime();
  	}
  </script>
</html>
