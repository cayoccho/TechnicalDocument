package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AuthorAddForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Author ata add page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Enter details of the Author</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<form method=\"POST\" action=\"AuthorAdd.jsp\">\r\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" border=\"2\">\r\n");
      out.write("<tr><td colspan=\"2\" bgcolor=\"blue\">\r\n");
      out.write("Person data\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Person Name\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"pname\" value=\"Test\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("person_DOB\r\n");
      out.write("</td><td>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Person Age\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"page\" value=\"23\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Person Country\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"pcntry\" value=\"India\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Person Email\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"pemail\" value=\"test@test.com\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td colspan=\"2\" bgcolor=\"blue\">\r\n");
      out.write("Author details\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Nick Name\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"nname\" value=\"TT\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Publisher\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"pubname\" value=\"Sun Pub\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Is Alive\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"isalive\" value=\"Y\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td colspan=\"2\" bgcolor=\"blue\">\r\n");
      out.write("Work details\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Work Name\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"wname\" value=\"Java RMI\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("Work Category\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"wcat\" value=\"Fiction\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>\r\n");
      out.write("Work Copies sold\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"wsold\" value=\"345\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>\r\n");
      out.write("Work value\r\n");
      out.write("</td><td>\r\n");
      out.write("<input type=\"text\" name=\"wvalue\" value=\"34\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td  colspan=\"2\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"submit\"/>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
