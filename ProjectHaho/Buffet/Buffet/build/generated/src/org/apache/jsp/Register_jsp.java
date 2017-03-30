package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <!----meta---->\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("\n");
      out.write("        <!----CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle2.css\">\n");
      out.write("      \n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styleregis.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"li\").hover(function () {\n");
      out.write("                    var itemwidth = $(this).width();\n");
      out.write("                    $(this).prepend(\"<div class='hover'></div>\");\n");
      out.write("                    $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth});\n");
      out.write("                    $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("                }, function () {\n");
      out.write("\n");
      out.write("                    $(this).find(\"div\").slideUp('1000').fadeOut('1000');\n");
      out.write("                    $(this).find(\"div\").remove();\n");
      out.write("                    $(this).find(\"ul\").fadeOut('1000');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center><a href=\"http://localhost:8080/Buffet/index.jsp\"> <img src=\"images/12-1.jpg\" alt=\"head\"></a></center> \n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/include/pageHeader.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->   \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <span style=\" font-family: Century Gothic; font-size:30pt;padding-left:5%;\">R E G I S T E R</span> <hr width=\"90%\"> \n");
      out.write("\n");
      out.write("        <div class=\"register\">\n");
      out.write("            <form id=\"regis\" action ='Register' method=\"post\">\n");
      out.write("                <div class=\"register-top-grid\">\n");
      out.write("                     <h3>LOGIN INFORMATION</h3>\n");
      out.write("                    <div class=\"fadeInLeft\">\n");
      out.write("                        <span>First Name<label>*</label></span>\n");
      out.write("                        <input type=\"text\" name=\"userFname\" required > \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fadeInRight\">\n");
      out.write("                        <span>Last Name<label>*</label></span>\n");
      out.write("                        <input type=\"text\" name=\"userLname\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fadeInRight\">\n");
      out.write("                        <span>Email Address<label>*</label></span>\n");
      out.write("                        <input type=\"text\" name=\"userEmail\" required >\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write(" <br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("         \n");
      out.write("                <div class=\"register-bottom-grid\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"fadeInRight\">\n");
      out.write("                        <span>Username<label>*</label></span>\n");
      out.write("                        <input type=\"text\" name=\"username\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fadeInLeft\">\n");
      out.write("                        <span>Password<label>*</label></span>\n");
      out.write("                        <input type=\"password\" name=\"userPassword\" id=\"password\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"fadeInRight\">\n");
      out.write("                        <span>Confirm Password<label>*</label></span>\n");
      out.write("                        <input type=\"password\" name=\"ReuserPassword\" id=\"confirmPass\" required >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("          \n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <div class=\"register-but\">\n");
      out.write("          \n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" value=\"create you account now\" onclick=\"checkPass()\">\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<br>\n");
      out.write("<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${request.getAttribute(\"message\")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("    <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--#################################################################################################-->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <hr>\n");
      out.write("        <center>\n");
      out.write("            <p style=\"color:white\">© SIT KMUTT 2015 | Designed by Project X </p>\n");
      out.write("            <a href=\"#\">About Us</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Contact Us</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Privacy Policy</a> &emsp; &emsp;\n");
      out.write("            <a href=\"#\">Terms & Condition</a>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script language=\"javaScript\">\n");
      out.write("        var pass = document.getElementById(\"password\");\n");
      out.write("        var conpass = document.getElementById(\"confirmPass\");\n");
      out.write("        function checkPass() {\n");
      out.write("            if (pass.value != conpass.value) {\n");
      out.write("                conpass.setCustomValidity(\"Password not match!\");\n");
      out.write("            } else {\n");
      out.write("                conpass.setCustomValidity(\"\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
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
