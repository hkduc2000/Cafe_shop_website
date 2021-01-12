<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "template/header.jsp"%>
<a href="list"> 
    <img style="width: 100%" class="p-4" src="https://i.ytimg.com/vi/AMjUidXBb-Y/maxresdefault.jpg">
    <img style="width: 100%" src="https://cdn3.vectorstock.com/i/1000x1000/60/07/christmas-sale-banner-december-holidays-vector-18376007.jpg">
</a>

<%@ include file = "template/footer.jsp"%>
<!--<h1>Hello</h1>
<form action="start">
    <input type="number" name="v1">
    <input type="number" name="v2">
    <input type="submit">
</form>-->