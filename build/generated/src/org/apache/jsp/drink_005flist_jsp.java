package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class drink_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Coffee Shop</title>\r\n");
      out.write("    <!--Bootstrap-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Medium Style Editor -->\r\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/npm/medium-editor@latest/dist/js/medium-editor.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/medium-editor@latest/dist/css/medium-editor.min.css\" type=\"text/css\"\r\n");
      out.write("          media=\"screen\" charset=\"utf-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/main_style_sheet.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <img style=\"width: 100%;\" \r\n");
      out.write("        src=\"https://www.highlandscoffee.com.vn/vnt_upload/weblink/HCO-7644-FESTIVE-2021-SOCIAL-WEB-BANNER.jpg\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"\">Coffee Shop</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"list\">Đồ uống</a>\r\n");
      out.write("                </li>\r\n");
      out.write("               \r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            Quản lí\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"add\">Thêm món</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"order_manage\">Đơn hàng</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("            \r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"nav-item mr-3\" href=\"cart\" style=\"text-decoration: none;\">\r\n");
      out.write("                    <i style=\"font-size:25px\" >\r\n");
      out.write("                        <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-cart4\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </i>\r\n");
      out.write("                    <span id='lblCartCount' style=\"border-radius: 9px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.orderInfo.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-primary mr-sm-2 my-2 my-lg-0\" data-toggle=\"modal\" data-target=\"#loginModal\">\r\n");
      out.write("                        Đăng nhập\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn btn-primary mr-sm-5  my-2 my-lg-0\" data-toggle=\"modal\" data-target=\"#registerModal\">\r\n");
      out.write("                        Đăng kí\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"nav-item btn btn-info mr-2\" data-toggle=\"modal\" data-target=\"#profileModal\">\r\n");
      out.write("                        Chào ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                        <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-person-circle\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                        <path d=\"M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z\"/>\r\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z\"/>\r\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a type=\"button\" class=\"btn btn-secondary mr-2 ml-2\" href=\"logout\">\r\n");
      out.write("                        Đăng xuất\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- Login -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" >\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content p-4\">\r\n");
      out.write("                <h5 class=\"modal-title\">Đăng nhập</h5> <br>\r\n");
      out.write("                <form action=\"login\" method=\"POST\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label >Tên đăng nhập:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Nhập tên đăng nhập\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label >Mật khẩu:</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Nhập mật khẩu\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"text-align: center;\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Đăng nhập</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Register -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content p-4\">\r\n");
      out.write("                <h5 class=\"modal-title\">Đăng kí</h5> <br>\r\n");
      out.write("                <form action=\"register\" method=\"post\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Email:</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Nhập email\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Họ tên:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Nhập họ tên\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Số điện thoại:</label>\r\n");
      out.write("                        <input type=\"phonenumber\" class=\"form-control\" name=\"phone\" placeholder=\"Nhập số điện thoại\" \r\n");
      out.write("                               pattern=\"[0-9]{9,12}\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label >Địa chỉ:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"Nhập địa chỉ\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Tên đăng nhập:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Nhập tên đăng nhập\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Mật khẩu:</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Nhập mật khẩu\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"text-align: center;\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Đăng kí</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--Profile modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"profileModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\">Thông tin cá nhân</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Họ tên:</td>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Email:</td>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Địa chỉ:</td>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Số điện thoại:</td>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\" style=\"text-align: center;\">\r\n");
      out.write("                    <a href=\"profile_edit\" class=\"btn btn-info\">Chỉnh sửa thông tin/Mật khẩu</a>\r\n");
      out.write("                    <a class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container mt-2\" style=\"min-height: 70vh;\">\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a onclick=\"switchTab(1);\" class=\"nav-link active\" data-toggle=\"tab\" href=\"#ctg1\">\n");
      out.write("            Cà phê\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a onclick=\"switchTab(2);\" class=\"nav-link \" data-toggle=\"tab\" href=\"#ctg2\">\n");
      out.write("            Nước ép\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a onclick=\"switchTab(3);\" class=\"nav-link \" data-toggle=\"tab\" href=\"#ctg3\">\n");
      out.write("           Trà sữa\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a onclick=\"switchTab(4);\" class=\"nav-link \" data-toggle=\"tab\" href=\"#ctg4\">\n");
      out.write("            Trà\n");
      out.write("        </a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    <div class=\"form-inline ml-5 mb-1\">\n");
      out.write("        <input class=\"form-control mr-2\" id=\"searchingInput\" style=\"width: 150px; display: inline-block;\" \n");
      out.write("                   type=\"search\" placeholder=\"Tìm kiếm\">\n");
      out.write("        <button class=\"btn btn-outline-success\" onclick=\"searchItems();\">Tìm kiếm\n");
      out.write("            <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-search\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M10.442 10.442a1 1 0 0 1 1.415 0l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1 1 0 0 1 0-1.415z\"/>\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z\"/>\n");
      out.write("            </svg>\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"tab-content\">\n");
      out.write("\n");
      out.write("    <div id=\"ctg1\" class=\"container tab-pane fade active show\"><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"col-6 col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
      out.write("                <a href=\"item_detail?itemid=8\" style=\"text-decoration: none;\">\n");
      out.write("                    <img src =\"https://www.highlandscoffee.com.vn/vnt_upload/product/03_2018/PHIN-SUA-DA.png\" width=\"100%\">\n");
      out.write("                    <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">Phin sữa đá</p>\n");
      out.write("                    <b class=\"truncate pl-2\" style=\"color:black;\">\n");
      out.write("                        <span class=\"addsep\">5699000</span>đ\n");
      out.write("                        -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">6690000</span>đ</span>\n");
      out.write("                    </b>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6  col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
      out.write("                <a href=\"item_detail?itemid=9\" style=\"text-decoration: none;\">\n");
      out.write("                    <img src =\"https://www.highlandscoffee.com.vn/vnt_upload/product/05_2018/CFD.png\" width=\"100%\">\n");
      out.write("                    <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">Phin đen đá</p>\n");
      out.write("                    <b class=\"truncate pl-2\" style=\"color:black;\">\n");
      out.write("                        <span class=\"addsep\">5299000</span>đ\n");
      out.write("                        -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">6490000</span>đ</span>\n");
      out.write("                    </b>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"ctg2\" class=\"container tab-pane fade \"><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-6  col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
      out.write("                <a href=\"item_detail?itemid=1\" style=\"text-decoration: none;\">\n");
      out.write("                    <img src =\"https://media.bizwebmedia.net/Sites/68297/data/upload/orange_juice.jpg\" width=\"100%\">\n");
      out.write("                    <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">Cam ép</p>\n");
      out.write("                    <b class=\"truncate pl-2\" style=\"color:black;\">\n");
      out.write("                        <span class=\"addsep\">3799000</span>đ\n");
      out.write("                        -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">5080000</span>đ</span>\n");
      out.write("                    </b>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"ctg3\" class=\"container tab-pane fade \"><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-6  col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
      out.write("                <a href=\"item_detail?itemid=16\" style=\"text-decoration: none;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <img src =\"https://gongcha.com.vn/wp-content/uploads/2018/10/Hinh-Web-OKINAWA-TR%C3%80-S%E1%BB%AEA.png\" width=\"100%\">\n");
      out.write("                    <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">Trà sữa nướng</p>\n");
      out.write("                    <b class=\"truncate pl-2\" style=\"color:black;\">\n");
      out.write("                        <span class=\"addsep\">2850000</span>đ\n");
      out.write("                        -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">3690000</span>đ</span>\n");
      out.write("                    </b>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"ctg4\" class=\"container tab-pane fade \"><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-6  col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
      out.write("                <a href=\"item_detail?itemid=18\" style=\"text-decoration: none;\">\n");
      out.write("                    <img src=\"https://congthucphache.com/wp-content/uploads/2019/12/tra-thach-dao.jpg\" width=\"100%\">\n");
      out.write("                    <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">Trà đào</p>\n");
      out.write("                    <b class=\"truncate pl-2\" style=\"color:black;\">\n");
      out.write("                        <span class=\"addsep\">7800000</span>đ\n");
      out.write("                        -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">10390000</span>đ</span>\n");
      out.write("                    </b>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <footer class=\"page-footer font-small\" style=\"background: #66ccff; margin-top: 400px;\">\n");
      out.write("        <div class=\"footer-copyright text-center py-3\">© 2021 Copyright:\n");
      out.write("          <a href=\"https://mdbootstrap.com/\">PROJECT LAB JAVA WEB</a>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col-6 col-lg-3 mt-1 item pagingitem\" style=\"text-align: center;\">\n");
          out.write("                    <a href=\"item_detail?itemid=8\" style=\"text-decoration: none;\">\n");
          out.write("                        <img src =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"100%\">\n");
          out.write("                        <p class=\"truncate itemname pl-3 mb-0\" style=\"color:black;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <b class=\"truncate pl-2\" style=\"color:black;\">\n");
          out.write("                            <span class=\"addsep\">5699000</span>đ\n");
          out.write("                            -<span class=\"d-block d-sm-inline\"><span class=\"addsep\">6690000</span>đ</span>\n");
          out.write("                        </b>\n");
          out.write("                    </a>\n");
          out.write("                </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
