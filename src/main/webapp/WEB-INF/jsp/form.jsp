<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*"%>
<%File f = new File("/FormServlet");
String path = f.getName();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form action="<%=path %>" method="post" >
<p>点数（1-100）を入力してください！！</p><br>
<input type="text" name="point" >
<input type="submit" name="submit-btn" value="送信">

</form>

</body>
</html>