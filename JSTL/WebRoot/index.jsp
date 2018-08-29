<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <c:set var="code" value="<script>alert('hello world!');</script>" scope="request"></c:set>
    <c:out value="${code}" escapeXml="true"/>
    <br/>
    <c:url value="/index.jsp" var="a" scope="request">
    	<c:param name="username" value="郑伟"/>
    </c:url>
    <br/>
    ${pageContext.request.servletContext }<br/>
    ${pageContext.request.contextPath }/Aervlet<br/>
    <hr/>
    ${requestScope.a }<br/>
    <a href="<c:url value="/index.jsp"/>">点击回到主页</a>
    <hr/>
    <c:if test="${not empty requestScope.code }">
    	GGWP!
    </c:if>
    <hr/>
    <c:choose>
    	<c:when test="${not empty param.name }">
    		您好！${param.name }
    	</c:when>
    	<c:otherwise>
    		滚犊子！
    	</c:otherwise>
    </c:choose>
    <hr/>
    <%
    	String[] strs={"one","two"};
    	request.setAttribute("strs", strs);
    %>
    <c:forEach var="i" begin="1" end="10">
    	${pageScope.i }
    </c:forEach>
    <hr/>
    <c:forEach items="${requestScope.strs}" var="strs" >
    	${strs}<br/>
    </c:forEach>
  </body>
</html>
