<%--
  Created by IntelliJ IDEA.
  User: Veigar
  Date: 2020/2/18
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
    <form action="uploadImage" method="post" enctype="multipart/form-data">
        选择图片:<input type="file" name="image" accept="image/*" />
        <br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
