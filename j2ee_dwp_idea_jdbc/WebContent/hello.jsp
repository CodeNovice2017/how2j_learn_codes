<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/10
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*"%>
<%--<%@ include file="footer.jsp"%>--%>
<jsp:include page="footer.jsp">
    <jsp:param name="year" value="2020"></jsp:param>
</jsp:include>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h1>Hello JSP!</h1>
<%="Hello JSP!"%>
<%out.println("hello JSP!");%>
<%=new Date().toLocaleString()%>
<%
    List<String> words = new ArrayList<String>();
    words.add("today");
    words.add("is");
    words.add("a");
    words.add("great");
    words.add("day");
%>
<table width="200px" align="center" border="1px" cellspacing="0">
<% for(String word: words){ %>
<tr>
    <td><%=word%></td>
</tr>
<%}%>
</table>
</body>
</html>
