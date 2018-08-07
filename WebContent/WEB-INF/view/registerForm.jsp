<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BMI calculator</title>
<style>
	.error {color:red}
</style>
</head>
<body>

<h2>Student BMI Calculate Form</h2>

Required fields (*)
<br><br>

<form:form action = "processForm" modelAttribute="student">

First Name: <form:input path="firstname" />

<br><br>

Last Name(*): <form:input path="lastname"/>
<form:errors path="lastname" cssClass="error"/>

<br><br>

Height(*): <form:input path = "height"/> (centimeters)


<form:errors path="height" cssClass="error"/>
<br><br>

Weight(*): <form:input path = "weight"/> (kilograms)
<form:errors path="weight" cssClass="error"/> 

<br><br>
<input type="submit" value="submit"/>




</form:form>

<br><br><br>

<a href="">Go back to the Main menu</a>


</body>

</html>