package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import domain.LoanApplication;
import java.util.Date;

public final class loanParameters_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


			private Random generator = new Random();
		
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");

			
			int generatedInt = generator.nextInt();
		while(generatedInt < 0){
			generatedInt = generator.nextInt();
		}
			String number = String.valueOf(generatedInt);
/* 		LoanApplication loan = new LoanApplication();
			loan.setNumber(number);
			loan.setDate(new Date());
			session.setAttribute("loan", loan); */ 
		
      out.write("\n");
      out.write("\t\t");
      domain.LoanApplication loan = null;
      synchronized (session) {
        loan = (domain.LoanApplication) _jspx_page_context.getAttribute("loan", PageContext.SESSION_SCOPE);
        if (loan == null){
          loan = new domain.LoanApplication();
          _jspx_page_context.setAttribute("loan", loan, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("loan"), "number",
number );
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("loan"), "date",
new Date() );
      out.write("\n");
      out.write("\t\t");
session.setAttribute("loan", loan);  
      out.write("\n");
      out.write("\t\tWygenerowany numer wniosku: ");
      out.print(number );
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"person.jsp\">\n");
      out.write("\t\t\t<label>Wnioskowana kwota : <input type=\"number\" id=\"amount\" name=\"amount\"/></label></br>\n");
      out.write("\t\t\t<label>Ilość rat : <input type=\"number\" id=\"installmentCount\" name=\"installmentCount\"/></label></br>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"następny krok\"/>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
