<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="services.LoanService" %>
<%@ page import="domain.LoanApplication" %>
<%@ page import="domain.Address" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="loanService" class="services.LoanService" scope="application"/>
	<jsp:useBean id="loan" class="domain.LoanApplication" scope="session"/>
	<jsp:useBean id="parameters" class="domain.LoanParameters" scope="session"/>
	<jsp:useBean id="person" class="domain.Person" scope="session"/>
	<jsp:useBean id="address" class="domain.Address" scope="session"/>
	
	<jsp:setProperty property="*" name="person"/>
	<jsp:setProperty property="*" name="address"/>
	
	<%
		person.setAddress(address);
		loan.setPerson(person);
		loan.setParameters(parameters);
		loan.setPerson(person);
		loanService.add(loan);
		
	%>
	<ul>
	<%
		for(LoanApplication loanApplication: loanService.getAll()){
	%>
	<li>Wniosek:<%= loanApplication.getNumber() 
								+" Osoba: "+ loanApplication.getPerson().getSurname()
								+" Kwota: "+ loanApplication.getParameters().getAmount()
								+" Adres: "+ loanApplication.getPerson().getAddress().toString() %></li>
	<%
		}
	%>
	<form action="index.jsp" ><input type="submit" value="Strona główna"/></form>
	</ul>
</body>
</html>