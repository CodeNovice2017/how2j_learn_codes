<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/13
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" import="bean.Hero,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix='fmt' %>
<html>
<head>
    <title>listHero</title>
</head>
<body>
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>hp</td>
            <td>damage</td>
            <td>edit</td>
            <td>delete</td>
        </tr>
        <c:forEach items="${heros}" var="hero" varStatus="st">
            <tr>
                <td>${hero.id}</td>
                <td>${hero.name}</td>
                <td>${hero.hp}</td>
                <td>${hero.damage}</td>
                <td><a href='editHero?id=%d'>edit</a></td>
                <td><a href='deleteHero?id=%d'>delete</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="center">
                <a href="?start=0">[首 页]</a>
                <a href="?start=${pre}">[上一页]</a>
                <a href="?start=${next}">[下一页]</a>
                <a href="?start=${last}">[尾 页]</a>
            </td>
        </tr>
    </table>
</body>
</html>
