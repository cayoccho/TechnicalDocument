package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.author.data.*;
import com.author.dao.*;
import java.util.*;

public final class AuthorAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

try{
	
	Person p = new Person();
	Author auth = new Author();
	Work w = new Work();
	AuthorDao adao = new AuthorDao();
	
	p.setPersonName(request.getParameter("pname"));
	p.setCountry(request.getParameter("pcntry"));
	p.setAge(new Integer(request.getParameter("page")).intValue());
	p.setEmail(request.getParameter("pemail"));
	p.setDOB(new Date());
	
	auth.setPerson(p);
	auth.setNickName(request.getParameter("nname"));
	auth.setIsAlive(request.getParameter("isalive"));
	auth.setPublisherName(request.getParameter("pubname"));

	w.setWorkName(request.getParameter("wname"));
	w.setWorkCategory(request.getParameter("wcat"));
	w.setValue(new Double(request.getParameter("wvalue")));
	w.setCopiesSold(new Integer(request.getParameter("wsold")).intValue());
	
	Set s = new HashSet();
	s.add(w);
	auth.setWork(s);
	adao.create(auth);
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
