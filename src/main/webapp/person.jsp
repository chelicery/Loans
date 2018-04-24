<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="parameters" class="domain.LoanParameters" scope="session"/>
	
	<jsp:setProperty property="amount" name="parameters" param="amount"/>
<%-- <%-- 	<jsp:setProperty property="amount" name="installmentCount" name="parameters" param="installmentCount"/>
 --%>	 --%>
	numer wnioski: <jsp:getProperty property="number" name="loan"/></br>
	wnioskowana kwota: <jsp:getProperty property="amount" name="parameters"/>
	<% session.setAttribute("parameters", parameters); %>
	<form action="adress.jsp">
		<label>Imię: <input type="text" id="firstName" name="firstName"/></label>
		<label>Nazwisko: <input type="text" id="surname" name="surname"/></label>
		<label>Nr pesel: <input type="text" id="pesel" name="pesel"/></label>
		<input type="submit" value="następny krok"/>
	</form>
	
	
</body>
</html>