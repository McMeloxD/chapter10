/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-22 13:04:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>异步提交商品</title>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("    //注意：jQuery官网引用地址最近国内访问会经常出现打不开的情况，请尽量不要调用官网引用地址！\r\n");
      out.write("    //下面为微软地址\r\n");
      out.write("   src=\"https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form id=\"products2\">\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("        <tr><th>商品id</th><th>商品名称</th><th>提交</th></tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><input name=\"proId\" value=\"1\" id=\"proId\" type=\"text\"></td>\r\n");
      out.write("            <td><input name=\"proName\" value=\"三文鱼\" id=\"proName\" type=\"text\"></td>\r\n");
      out.write("            <td><input type=\"button\" value=\"提交单个商品\" onclick=\"submitProduct()\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><input name=\"proId\" value=\"2\" id=\"proId2\" type=\"text\"></td>\r\n");
      out.write("            <td><input name=\"proName\" value=\"杜康\" id=\"proName2\" type=\"text\"></td>\r\n");
      out.write("            <td><input type=\"button\" value=\"提交多个商品\" onclick=\"submitProducts()\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</from>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function submitProduct(){\r\n");
      out.write("        var proId= $(\"#proId\").val();\r\n");
      out.write("        var proName = $(\"#proName\").val();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/getProduct1\",\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            data: JSON.stringify({proId: proId, proName: proName}),\r\n");
      out.write("            contentType: \"application/json;charset=UTF-8\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (response) {alert(response);}\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function submitProducts(){\r\n");
      out.write("            var pro1={proId:$(\"#proId\").val(),proName:$(\"#proName\").val()}\r\n");
      out.write("            var pro2={proId:$(\"#proId2\").val(),proName:$(\"#proName2\").val()}\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/getProductList\",\r\n");
      out.write("                type: \"post\",\r\n");
      out.write("                data: JSON.stringify([pro1,pro2]),\r\n");
      out.write("                contentType: \"application/json;charset=UTF-8\",\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (response) {alert(response);}\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
