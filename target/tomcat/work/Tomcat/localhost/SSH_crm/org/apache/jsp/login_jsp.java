/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-10 15:50:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("    <META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <STYLE type=text/css>\r\n");
      out.write("        BODY {\r\n");
      out.write("            FONT-SIZE: 12px;\r\n");
      out.write("            COLOR: #ffffff;\r\n");
      out.write("            FONT-FAMILY: 宋体\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        TD {\r\n");
      out.write("            FONT-SIZE: 12px;\r\n");
      out.write("            COLOR: #ffffff;\r\n");
      out.write("            FONT-FAMILY: 宋体\r\n");
      out.write("        }\r\n");
      out.write("    </STYLE>\r\n");
      out.write("\r\n");
      out.write("    <META content=\"MSHTML 6.00.6000.16809\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<FORM id=form1 name=form1 action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_login.action\" method=post>\r\n");
      out.write("\r\n");
      out.write("    <DIV id=UpdatePanel1>\r\n");
      out.write("        <DIV id=div1\r\n");
      out.write("             style=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("        <DIV id=div2\r\n");
      out.write("             style=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <DIV>&nbsp;&nbsp;</DIV>\r\n");
      out.write("        <DIV>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>\r\n");
      out.write("                <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD style=\"HEIGHT: 105px\"><IMG src=\"images/login_1.gif\"\r\n");
      out.write("                                                   border=0></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD background=images/login_2.jpg height=300>\r\n");
      out.write("                        <TABLE height=300 cellPadding=0 width=900 border=0>\r\n");
      out.write("                            <TBODY>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                                <TD colSpan=2 height=35></TD>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                            <TR>\r\n");
      out.write("                                <TD width=360></TD>\r\n");
      out.write("                                <TD>\r\n");
      out.write("                                    <TABLE cellSpacing=0 cellPadding=2 border=0>\r\n");
      out.write("                                        <TBODY>\r\n");
      out.write("                                        <TR>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\" width=80>登 录 名：</TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\" width=150><INPUT id=txtName\r\n");
      out.write("                                                                                      style=\"WIDTH: 130px\"\r\n");
      out.write("                                                                                      name=username>\r\n");
      out.write("                                            </TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\" width=370><SPAN\r\n");
      out.write("                                                    id=RequiredFieldValidator3\r\n");
      out.write("                                                    style=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入登录名</SPAN>\r\n");
      out.write("                                            </TD>\r\n");
      out.write("                                        </TR>\r\n");
      out.write("                                        <TR>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\">登录密码：</TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\"><INPUT id=txtPwd\r\n");
      out.write("                                                                            style=\"WIDTH: 130px\"\r\n");
      out.write("                                                                            type=password\r\n");
      out.write("                                                                            name=password></TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 28px\"><SPAN\r\n");
      out.write("                                                    id=RequiredFieldValidator4\r\n");
      out.write("                                                    style=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入密码</SPAN>\r\n");
      out.write("                                            </TD>\r\n");
      out.write("                                        </TR>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                                        <TR>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("                                            <TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("                                        </TR>\r\n");
      out.write("                                        <TR>\r\n");
      out.write("                                            <TD></TD>\r\n");
      out.write("                                            <TD><INPUT id=btn\r\n");
      out.write("                                                       style=\"BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px\"\r\n");
      out.write("\r\n");
      out.write("                                                       type=image src=\"images/login_button.gif\"\r\n");
      out.write("                                                       name=btn>\r\n");
      out.write("                                            </TD>\r\n");
      out.write("                                        </TR>\r\n");
      out.write("                                        </TBODY>\r\n");
      out.write("                                    </TABLE>\r\n");
      out.write("                                </TD>\r\n");
      out.write("                            </TR>\r\n");
      out.write("                            </TBODY>\r\n");
      out.write("                        </TABLE>\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <TD><IMG src=\"images/login_3.jpg\"\r\n");
      out.write("                             border=0></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("        </DIV>\r\n");
      out.write("    </DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
