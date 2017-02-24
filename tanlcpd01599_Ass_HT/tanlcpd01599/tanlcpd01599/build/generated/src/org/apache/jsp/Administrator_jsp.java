package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Catalogue;
import Controller.LoginServlet;
import Controller.LoginServlet;
import DAO.ProductDAO;
import DAO.CalelogueDAO;

public final class Administrator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"CSS/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/Style_Product.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"CSS/boxover.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv4.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv_1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/test_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"File/SpryAssets/SpryMenuBarHorizontal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"File/SpryAssets/SpryMenuBar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("       \n");
      out.write("       <body  class=\"home\">\n");
      out.write("            ");

            CalelogueDAO calelogueDAO = new CalelogueDAO();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("Catalogue") != null) {
                Ma_loai = request.getParameter("Catalogue");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("<div class=\"wrapper_all\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("\n");
      out.write("    <div class=\"header_left\"><img src=\"Image/lg2.jpg\" width=\"300\" height=\"200\" /></div>\n");
      out.write("    <div class=\"header_right\">\n");
      out.write("    \t<div class=\"header_right_top\">\n");
      out.write("           \n");
      out.write("                                \n");
      out.write("        <a href=\"Login.jsp#login\" style=\"color:#F03\" ><strong>Đăng nhập</strong></a> I\n");
      out.write("     <a href=\"Register.jsp#dangky\" style=\"color:#F03\"><strong>Đăng ký</strong></a>\n");
      out.write("     \n");
      out.write("         <ul>\n");
      out.write("             <li class=\"lidn\" style=\"color: #F03;");
      out.print(LoginServlet.displayDN);
      out.write("\" </li>  ");
      out.print(LoginServlet.userN);
      out.write("\n");
      out.write("     <a style=\"color: #F00;");
      out.print(LoginServlet.displayDN);
      out.write("\" href=\"LogoutServlet\">Đăng xuất</a>\n");
      out.write("                                </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header_right_bottom\">\n");
      out.write("          <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("              <li><a href=\"MainPage.jsp#trangchu\"><center><strong>TRANG CHỦ</strong></center></a></li>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("             <li><a href=\"MainPage.jsp#bosuutap\"><center><strong>BỘ SƯU TẬP</strong></center></a>\n");
      out.write("                           </li>\n");
      out.write("             <li><a href=\"MainPage.jsp#sanpham\"><center><strong>SẢN PHẨM</strong></center></a><ul>\n");
      out.write("                                        ");

                                            for (Catalogue c : calelogueDAO.getListCategory()) {
                                        
      out.write("\n");
      out.write("                                        <li><a href=\"MainPage.jsp?Catalogue=");
      out.print(c.getMaloai());
      out.write('"');
      out.write('>');
      out.print( c.getTenloai());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("</li>\n");
      out.write("             <li><a href=\"MainPage.jsp#lienhe\"><center><strong>LIÊN HỆ</strong></center></a></li>\n");
      out.write("             <li><a href=\"MainPage.jsp#Fanpage\"><center><strong>FANPAGE</strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("                                    <div class=\"dangky\">\n");
      out.write("                                        </br>\n");
      out.write("                                        </br>\n");
      out.write("                                        <center>  \n");
      out.write("                                        \n");
      out.write("                                        <form action=\"Manager_Product.jsp\" method=\"get\">\n");
      out.write("                                            <input type=\"submit\" value=\"Quản lý sản phẩm\" name=\"qlsp\" size=\"30\" /></form></br>\n");
      out.write("                                        <form action=\"Catalogue.jsp\" method=\"get\">\n");
      out.write("                                            <input type=\"submit\" value=\"Quản lí loại sản phẩm\" name=\"qllsp\" size=\"30\" /></form>\n");
      out.write("                                        </center>\n");
      out.write("                                    </div>                                   \n");
      out.write("                                    \n");
      out.write(" <div class=\"footer\">\n");
      out.write("    <div class=\"footer_left\"><img src=\"Image/lg2.jpg\" width=\"300\" height=\"155\" /></div>\n");
      out.write("    <div class=\"footer_right\">\n");
      out.write("    <div class=\"footer1_1\">\n");
      out.write("      <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("             <li><a href=\"#\"><center><strong>Giới thiệu</strong></center></a></li>\n");
      out.write("             \n");
      out.write("             <li><a href=\"#\"><center><strong>Trợ giúp</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Góp ý</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Điều khoản</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Bản quyền</strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("           <div class=\"footer2\">\n");
      out.write("  <table width=\"355\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write("  <td> Bản quyền và phát triển bởi Công ty Đông Ri. Chịu trách nhiệm nội dung: Nhà báo, Tiến sĩ Lê Công Tân - Trưởng chi nhánh phía Nam Đà Nẵng - Phó giám đốc Công ty Đông Ri.\n");
      out.write("<p>Giấy phép số 29/GP-TTĐT do Bộ Thông tin và Truyền thông cấp ngày 11/02/2010 và giấy phép số 88/GP-TTĐT của Sở Thông tin và Truyền thông TP.Đà Nẵng cấp ngày 28/7/2015.</p>\n");
      out.write("  </td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    <div class=\"footer3\">\n");
      out.write("  <table width=\"355\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("Địa chỉ: 333 Lê Duẩn, TP.Đà Nẵng.\n");
      out.write("<p>Điện thoại: (84-8) 38251028 -  Fax: (84-8) 38251049.</p>\n");
      out.write("Quảng cáo: 0936009959 - Email: dongri.ad@gmail.com\n");
      out.write("<p>Toà soạn & hỗ trợ: (84-8)38251028Email: dongri@bongda.com</td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</div>                                   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
