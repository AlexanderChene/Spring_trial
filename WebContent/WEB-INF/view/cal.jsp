<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the temperature calculator</title>
</head>
<body>
<h2>km to mile calculator</h2>

<form action ="result" method="get">
	<input type="text" name="user" placeholder="what's your name"/><br>
	<input type="text" name="value" placeholder="Enter the length"/>
	<input type= "radio" name="length" value="mile"/>mile
	<input type = "radio" name = "length" value="km"/>km<br>
	
	<input type = "submit" value="submit">


</form>

Hi, ${param.user }<br>



${message }
<br><br><br>

<a href = "">Back To Main Menu</a>

</body>
</html>