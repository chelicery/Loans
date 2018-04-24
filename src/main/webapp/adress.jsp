<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<jsp:useBean id="person" class="domain.Person" scope="session"/>
	
	<jsp:setProperty property="firstName" name="person" param="firstName"/>
	<jsp:setProperty property="surname" name="person" param="surname"/>
	<jsp:setProperty property="pesel" name="person" name="parameters" param="pesel"/>
	<%				
		session.setAttribute("person", person); 
	%>
	
	<form action="success.jsp">
		<label>Miasto <input type="text" id="city" name="city"/></label>
		<label>kod pocztowy <input type="text" id="zipCode" name="zipCode"/></label>
		<label>ulica <input type="text" id="street" name="street"/></label>
		<label>Nr pesel: <input type="text" id="localNumber" name="localNumber"/></label>
		<label>Nr pesel: <input type="text" id="phone" name="phone"/></label>
		<input type="submit" value="następny krok"/>
	</form>
</body>
</html>