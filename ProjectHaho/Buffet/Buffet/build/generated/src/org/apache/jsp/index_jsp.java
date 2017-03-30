package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Index</title>\n");
      out.write("        <!----meta---->\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!----CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle2.css\">\n");
      out.write("        <link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
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
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                font-family: Century Gothic;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!--script--->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"li\").hover(function () {\n");
      out.write("                    var itemwidth = $(this).width(); /* Getting the LI width */\n");
      out.write("                    $(this).prepend(\"<div class='hover'></div>\"); /* Inserting a blank div into within li above the <a> tag*/\n");
      out.write("                    $(this).find(\"div\").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/\n");
      out.write("                    $(this).find(\"ul\").fadeIn('1000').slideDown('10000').css(\"display\", \"block\");\n");
      out.write("                }, function () {\n");
      out.write("\n");
      out.write("                    $(this).find(\"div\").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */\n");
      out.write("                    $(this).find(\"div\").remove();/* removing the <div> code from html at every mouseout event*/\n");
      out.write("                    $(this).find(\"ul\").fadeOut('1000'); /* fading out the sub menu */\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(document).scroll(function (e) {\n");
      out.write("                var scrollTop = $(document).scrollTop();\n");
      out.write("                if (scrollTop > 200) {\n");
      out.write("                    console.log(scrollTop);\n");
      out.write("                    $('.navbar-default2').removeClass('navbar-static-top').addClass('navbar-fixed-top');\n");
      out.write("                } else {\n");
      out.write("                    $('.navbar-default2').removeClass('navbar-fixed-top').addClass('navbar-static-top');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center><a href=\"http://localhost:8080/Buffet/index.jsp\"> <img src=\"images/12-1.jpg\" alt=\"head\"></a></center> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->\n");
      out.write("\n");
      out.write("    <!------nav head2------>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default2\">   \n");
      out.write("        <div class=\"navbar-header\" id=\"nav02\">\n");
      out.write("            <ul>\n");
      out.write("                <div class=\"hover\" style=\"display:block; width:120px;\"></div>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"http://localhost:8080/Buffet/index.jsp\" class=\"dropdown-toggle\"\n");
      out.write("                       data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">H O M E </span></a> </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Menu2</a>\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                        <a href=\"#\">sub-Menu2</a>\n");
      out.write("                        <a href=\"#\">sub-Menu2</a>\n");
      out.write("                        <a href=\"#\">Ssub-Menu2</a>\n");
      out.write("                        <a href=\"#\">sub-Menu2</a>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Menu3</a></li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Menu4</a>    </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Menu5 </a></li>\n");
      out.write("\n");
      out.write("  \n");
      out.write("                    ");
User u = null;
                        if(request.getSession().getAttribute("user") != null){
                         u = (User) request.getSession().getAttribute("user");}
      out.write("\n");
      out.write("                ");
if(u == null){
      out.write("\n");
      out.write("                    \n");
      out.write("                       <li class=\"login\">\n");
      out.write("                            &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;\n");
      out.write("                        </li>\n");
      out.write("                         <li class=\"login\">\n");
      out.write("                            &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"login\"><a href=\"http://localhost:8080/Buffet/Login.jsp\" class=\"login\" \n");
      out.write("                                             data-toggle=\"modal\" data-target=\"#basicModal\" >Log in</a>\n");
      out.write("                        </li>\n");
      out.write("                  \n");
      out.write("                 <!--- /*<--%}else if(u.getIsAdmin(u)){%>\n");
      out.write("                    <li class=\"login\"><a class=\"edit\" href=\"#\" >Add Thread</a></li>\n");
      out.write("                    <li class=\"login\"><a class=\"edit\" href=\"#\" >Edit</a></li>\n");
      out.write("                    <li class=\"login\"><a class=\"logout\" href=\"logout\" >Log out</a></li> -->\n");
      out.write("                \n");
      out.write("                    ");
}else{
      out.write("\n");
      out.write("                    ");
if(u.getIsAdmin().equalsIgnoreCase("y")){
      out.write("\n");
      out.write("                        <li ><a href = \"addThread.jsp\">AddThread</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                     <li class=\"login\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUserId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"login\"><a class=\"edit\" href=\"#\" >Edit Profile</a></li>\n");
      out.write("                       <li class=\"login\"><a class=\"logout\" href=\"logout\" >Log out</a></li>\n");
      out.write("                                           \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav><!---nav bar--->\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"wrapper row3\">\n");
      out.write("        <div id=\"slider\" class=\"clear\"> \n");
      out.write("            <!-- ################################################################################################ -->\n");
      out.write("            <div class=\"flexslider basicslider\">\n");
      out.write("                <ul class=\"slides\">\n");
      out.write("                    <li><a href=\"#\"><img class=\"radius-10\" src=\"images/sl01.jpg\" alt=\"\"></a></li>\n");
      out.write("                    <li><a href=\"#\"><img class=\"radius-10\" src=\"images/sl02.jpg\" alt=\"\"></a></li>\n");
      out.write("                    <li><a href=\"#\"><img class=\"radius-10\" src=\"images/sl03.jpg\" alt=\"\"></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- ################################################################################################ --> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <br><br>    \n");
      out.write("\n");
      out.write("    <!----##########################################################################################--->   \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!----##########################################################################################--->\n");
      out.write("            <div class=\"col-md-8 top-heading\">     \n");
      out.write("                <h1>F o o D </h1><br>  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!----##########################################################################################--->               \n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <div class=\"col-md-4 top-post\">\n");
      out.write("                <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic01.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] MEAT BAR 31 DESTINATION OF BEEF LOVERS</a></h4><p>\n");
      out.write("                            วันนี้ทางเราได้มีโอกาสมาทานที่ร้าน Meat Bar 31 ครับ เป็นร้าน Steak House \n");
      out.write("                            อยู่ในซอยสุขมวิท 31 สำหรับร้านนี้ต้องบอกว่าเราจะได้สนุกเพลิดเพลินกับการทานเนื้อดีๆ \n");
      out.write("                            ในแบบที่ชอบ\n");
      out.write("                        </p>\n");
      out.write("                        <span>NOVEMBER 08, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---book--->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <div class=\"post2\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic02.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] กินเจเยี่ยงราชาในราคาประหยัด ที่ CENTRALPLAZA WESTGATE</a></h4>\n");
      out.write("                        <p>  รีวิวนี้มาที่ The Cockle เป็นร้านอาหารทะเลแบบตามสั่งอยู่ใจกลางเมืองกรุง\n");
      out.write("                            ตกแต่งน่ารักๆ ถ่ายรูปสวย ที่แจ่มแมวคือมีให้เลือกแบบบุฟเฟ่ต์ด้วย \n");
      out.write("                            สายกินดุน่าจะชอบกัน</p>\n");
      out.write("                        <span>NOVEMBER 01, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--good2-->                    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div><!--top book-->\n");
      out.write("\n");
      out.write("            <!------------------------------------------------------------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 top-post\">\n");
      out.write("                <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic03.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] ชุดบาร์เบคอน ราคา 499 บาท ที่ BAR BQ PLAZA</a></h4><p>\n");
      out.write("                            เมนูเด่นของร้าน Bar BQ Plaza ที่หลายๆคนชอบ\n");
      out.write("                            ต้องเป็นเบคอนแน่นอน ซึ่งทางร้านก็เอาใจลูกค้า ด้วยการออกเมนูสุดคุ้ม ชุดแบบเน้นเบคอน \n");
      out.write("                            ชื่อชุด “บาร์เบคอน” ในราคา 499 บาท คุ้มขนาดไหน\n");
      out.write("                        </p>\n");
      out.write("                        <span>NOVEMBER 05, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---book--->  \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                 <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic04.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] KATSUYA (คัตสึยะ) ร้านหมูทอดสไตล์ญี่ปุ่นต้นตำหรับ</a></h4><p>\n");
      out.write("                            รีวิวนี้ยกพวกสี่คนมาที่ร้าน Katsuya (คัตสึยะ) กันครับ คัตสึยะเป็นร้านอาหารญี่ปุ่นแบบต้นตำหรับ \n");
      out.write("                            คือเป็นร้านที่เริ่มเปิดในประเทศญี่ปุ่นเลย จนมีสาขาอยู่ที่ญี่ปุ่นแล้วกว่า 300 สาขา \n");
      out.write("                            เมนูหลักของร้านจะเป็นทงคัตสึ หรือหมูทอดชุบเกล็ดขนมปัง\n");
      out.write("                        </p>\n");
      out.write("                        <span>OCTOBER 30, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---book---> \n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div><!--top book-->\n");
      out.write("\n");
      out.write("            <!------------------------------------------------------------------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 top-post\">\n");
      out.write("                <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic05.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] THE COCKLE บุฟเฟ่ต์อาหารทะเล สดๆ เน้นๆ 550 NET</a></h4>\n");
      out.write("                        <p>วันนี้มารีวิวงานเทศกาลอาหารเจที่ทาง Central จัดขึ้น โดยงานนี้จะมีจัดที่ \n");
      out.write("                            CentralPlaza CentralFestival ทุกสาขา และ CentralWorld\n");
      out.write("                            ชื่องาน J Food Festival อิ่มบุญใหญ่มาก\n");
      out.write("                          \n");
      out.write("                        </p>\n");
      out.write("                        <span>NOVEMBER 02, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---book---> \n");
      out.write("                <br>    \n");
      out.write("                <div class=\"post\">\n");
      out.write("                    <div class=\"post-top\">\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"images/pic06.jpg\" alt=\"\"></a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h4><a href=\"#\">[REVIEW] มาลองเมนูใหม่ ย่างถ่านหอมๆ ที่ โอโตยะ OOTOYA</a></h4>\n");
      out.write("                        <p>\n");
      out.write("                            สวัสดีคร้าบ วันนี้มาที่ร้านอาหารญี่ปุ่น Ootoya (โอโตยะ) สาขา\n");
      out.write("                            Central World เพื่อที่จะมาลองเมนูเซ็ตข้าวของร้านนี้ที่เพิ่งออกใหม\n");
      out.write("                            โดยเฉพาะเลยครับ\n");
      out.write("                        </p>\n");
      out.write("                        <span>OCTOBER 27, 2015</span>\n");
      out.write("                        <a href=\"#\" class=\"view\">read</a>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!---book--->  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div><!--top book-->\n");
      out.write("            <br>\n");
      out.write("            <div class=\"more-theme\">\n");
      out.write("                <a href=\"#\"> see more >> </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!----##########################################################################################--->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <hr> \n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-8 top-heading\">     \n");
      out.write("            <h1>D R i N K </h1><br> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("        <div class=\"col-md-4 top-post\">\n");
      out.write("            <div class=\"post\">\n");
      out.write("                <div class=\"post-top\">\n");
      out.write("                    <a href=\"#\"><img class=\"img-responsive\" src=\"images/dri01.jpg\" alt=\"\"></a>\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h4><a href=\"#\">ชื่อเรื่อง</a></h4><p>\n");
      out.write("                        รายละเอียด\n");
      out.write("                    </p>\n");
      out.write("                    <span>วัน/เดือน/ปี</span>\n");
      out.write("                    <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!---book--->  \n");
      out.write("\n");
      out.write("        </div><!--top book-->\n");
      out.write("\n");
      out.write("        <!------------------------------------------------------------------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-4 top-post\">\n");
      out.write("            <div class=\"post\">\n");
      out.write("                <div class=\"post-top\">\n");
      out.write("                    <a href=\"#\"><img class=\"img-responsive\" src=\"images/dri02.jpg\" alt=\"\"></a>\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h4><a href=\"#\">ชื่อเรื่อง</a></h4><p>\n");
      out.write("                        รายละเอียด\n");
      out.write("                    </p>\n");
      out.write("                    <span>08 October.2014</span>\n");
      out.write("                    <a href=\"#\" class=\"view\">VIEW</a>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!---book--->  \n");
      out.write("        </div><!--top book-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clearfix\"> </div>\n");
      out.write("    <!----##########################################################################################--->  \n");
      out.write("\n");
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
      out.write("\n");
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
