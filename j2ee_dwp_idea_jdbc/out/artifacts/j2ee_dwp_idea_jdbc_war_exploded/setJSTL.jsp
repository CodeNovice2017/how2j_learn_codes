<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/12
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*,bean.Hero" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix='fmt' %>
<html>
<head>
    <title>setJSTL</title>
</head>
<body>
    <c:set var="name1" value="${'gareen'}" scope="request" />
    通过标签获取name: <c:out value="${name1}"/>
    <c:remove var="name1" scope="request" />
    通过标签获取name: <c:out value="${name1}" /> <br>

    <c:set var="hp" value="${10}" scope="request" />
    <c:if test="${hp<5}">
        <p>这个英雄要挂了</p>
    </c:if>
    <c:if test="${!(hp<5)}">
        <p>这个英雄觉得自己还可以再抢救抢救</p>
    </c:if>
    <%
        pageContext.setAttribute("weapon", null);
        pageContext.setAttribute("lastwords", "");
        pageContext.setAttribute("items", new ArrayList());
    %>
    <c:if test="${(empty weapon)}">
        <p>没有装备武器</p>
    </c:if>
    <c:if test="${empty lastwords}">
        <p>挂了也没有遗言</p>
    </c:if>
    <c:if test="${empty items}">
        <p>物品栏为空</p>
    </c:if>
    <c:choose>
        <c:when test="${hp<5}">
            <p>这个英雄要挂了</p>
        </c:when>
        <c:otherwise>
            <p>这个英雄觉得自己还可以再抢救抢救</p>
        </c:otherwise>
    </c:choose>
    <%
        List<String> heros = new ArrayList<String>();
        heros.add("塔姆");
        heros.add("艾克");
        heros.add("巴德");
        heros.add("雷克赛");
        heros.add("卡莉丝塔");
        request.setAttribute("heros",heros);
    %>
    <!-- 使用jsp中的for循环来遍历List -->
    <table width="200px" align="center" border="1" cellspacing="0">
        <tr>
            <td>编号</td>
            <td>英雄</td>
        </tr>
        <%
            for(int i=0;i<heros.size();i++){
        %>
        <tr>
            <td><%=i%></td>
            <td><%=heros.get(i)%></td>
        </tr>
        <%
            }
        %>
    </table>
    <!-- 使用JSTL中的c:forEach 循环来遍历List -->
    <table width="200px" align="center" border="1" cellspacing="0">
        <c:forEach items="${heros}" var="hero" varStatus="st">
            <tr>
                <td>
                    <c:out value="${st.count}" />
                </td>
                <td>
                    <c:out value="${hero}" />
                </td>
            </tr>
        </c:forEach>
    </table>
    <c:set var="heros" value="塔姆,艾克;巴德|雷克赛!卡莉丝塔" />
    <c:forTokens items="${heros}" delims=":;|!" var="hero">
        <c:out value="${hero}" /> <br />
    </c:forTokens>
    <c:set var="money" value="888.8" />
    <fmt:formatNumber type="number" value="${money}" minFractionDigits="2" />

    <c:set var="name" value="${'gareen-pageContext'}" scope="page" />
    <c:set var="name" value="${'gareen-request'}" scope="request" />
    <c:set var="name" value="${'gareen-session'}" scope="session" />
    <c:set var="name" value="${'gareen-application'}" scope="application" />
    4个作用域都有name,优先获取出来的是 ： ${name}
    <%
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHp(616);
        request.setAttribute("hero", hero);
    %>
    英雄名字:${hero.name}
<c:set var="killNumber" value="10" />
${killNumber ge 10 ? "超神":"还没超神"}
</body>
</html>

