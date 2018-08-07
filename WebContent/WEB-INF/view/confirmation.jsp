<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your BMI value</title>
</head>
<body>
Result:
Hi, ${student.firstname} ${student.lastname}
<br>

Height: ${student.height} cm <br>
Weight: ${student.weight} kg <br>

<br><br>

Your BMI value is : ${BMI}

<br><br>

<a href="registerForm">Go back to form</a>

<br><br>

<b>BMI Categories:</b><br>
BMI &lt;= 18.5 : underweight<br>
18.5 - 24.9 : Normal Weight<br>
25 - 29.9 : overweight<br>
BMI of 30 or greater: Obisity<br>

</body>
</html>