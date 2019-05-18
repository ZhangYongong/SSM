<%--
  Created by IntelliJ IDEA.
  User: Zhangyh
  Date: 2019/5/18
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有的账户</h3>

    <c:forEach items="${list}" var="account">
        ${account.name}&nbsp;${account.money}<br>
    </c:forEach>
</body>
</html>
