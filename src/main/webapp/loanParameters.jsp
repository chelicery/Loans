<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%@ page import="domain.LoanApplication" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		<%!
			private Random generator = new Random();
		%>
		<%
			
			int generatedInt = generator.nextInt();
		while(generatedInt < 0){
			generatedInt = generator.nextInt();
		}
			String number = String.valueOf(generatedInt);
/* 		LoanApplication loan = new LoanApplication();
			loan.setNumber(number);
			loan.setDate(new Date());
			session.setAttribute("loan", loan); */ 
		%>
		<jsp:useBean id="loan" class="domain.LoanApplication" scope="session"/>
		<jsp:setProperty property="number" name="loan" value="<%=number %>"/>
		<jsp:setProperty property="date" name="loan" value="<%=new Date() %>"/>
		<%session.setAttribute("loan", loan);  %>
		Wygenerowany numer wniosku: <%=number %>
		
		<form action="person.jsp">
			<label>Wnioskowana kwota : <input type="number" id="amount" name="amount"/></label></br>
			<label>Ilość rat : <input type="number" id="installmentCount" name="installmentCount"/></label></br>
			<input type="submit" value="następny krok"/>
		</form>
		
		
		
</body>
</html>