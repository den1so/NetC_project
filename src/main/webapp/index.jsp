<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Plugin tester</title>
</head>

<body>
<h1>Input Form</h1>
<form action = "myServlet" method = "GET">
  <table border = "0">

    <tr>
      <td><b>Name:</b></td>
      <td><input type = "text" name = "Name"
                 value = "" size = "35"/></td>
    </tr>
    <tr>
      <td colspan = "2"><input type = "submit" value = "Add"/></td>
    </tr>
  </table>
</form>
</body>
</html>