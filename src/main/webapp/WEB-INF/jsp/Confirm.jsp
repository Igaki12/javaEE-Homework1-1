<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Data" import="java.io.*"%>
    <%File f = new File("/FormServlet");
String path = f.getName();
%>
    <%Data data = (Data)request.getAttribute("data");
    String comment = data.getComment();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm</title>
</head>
<body>
<h1>結果</h1>
<p><%=comment %></p>
<button type="button" onclick="location.href='<%=path %>'">戻る</button>

</body>
</html>