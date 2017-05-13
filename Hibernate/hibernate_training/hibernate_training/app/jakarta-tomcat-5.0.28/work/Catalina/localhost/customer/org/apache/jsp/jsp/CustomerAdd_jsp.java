package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.trng.data.*;
import com.trng.dao.*;

public final class CustomerAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

try{
	Customer cust = new Customer();
	CustomerDetails cde = new CustomerDetails();
	CustomerDao cdao = new CustomerDao();
	cust.setUid(request.getParameter("uid"));
	cust.setFName(request.getParameter("FName"));
	cust.setLName(request.getParameter("LName"));
	cust.setDetails(cde);
	
	cde.setAddressLine1(request.getParameter("addressLine1"));
	cde.setAddressLine2(request.getParameter("addressLine2"));
	cde.setCity(request.getParameter("city"));
	cde.setMaritalStatus(request.getParameter("maritalStatus"));
	cde.setPincode(Integer.valueOf(request.getParameter("pincode")).intValue());
	
	cdao.createCustomer(cust);
	}
catch(Exception e){
	e.printStackTrace();

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("failure.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("success.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
