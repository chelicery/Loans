package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/success.jsp")
public class successFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			
			HttpSession session = httpRequest.getSession();
			String city = httpRequest.getParameter("city");
			String zip = httpRequest.getParameter("zipCode");
			String street = httpRequest.getParameter("street");
			String local = httpRequest.getParameter("localNumber");
			String phone = httpRequest.getParameter("phone");
			if (session.getAttribute("person") == null) {
				((HttpServletResponse) response).getWriter().println("zacznij od nowa");
				((HttpServletResponse) response).sendRedirect("index.jsp");
				}
			if(city.length() < 1 || zip.length() < 1 || street.length() < 1 || local.length() < 1 || phone.length() <1) {
				((HttpServletResponse) response).getWriter().println("żadne z pól nie może być puste");
				return;
//				((HttpServletResponse) response).sendRedirect("loanParameters.jsp");
			} 
			chain.doFilter(request, response);
		}
		

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}
