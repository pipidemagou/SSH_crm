/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-13 11:53:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listLevel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <TITLE>客户列表</TITLE>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("    <LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/Manage.css\" type=text/css\r\n");
      out.write("          rel=stylesheet>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("    <SCRIPT language=javascript>\r\n");
      out.write("      function to_page(page) {\r\n");
      out.write("        if (page) {\r\n");
      out.write("          $(\"#page\").val(page);\r\n");
      out.write("        }\r\n");
      out.write("        document.customerForm.submit();\r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("    </SCRIPT>\r\n");
      out.write("\r\n");
      out.write("    <META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<FORM id=\"customerForm\" name=\"customerForm\"\r\n");
      out.write("      action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/customer_listCondition.action\"\r\n");
      out.write("      method=post>\r\n");
      out.write("\r\n");
      out.write("    <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_019.jpg\"\r\n");
      out.write("                              border=0></TD>\r\n");
      out.write("            <TD width=\"100%\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_020.jpg\"\r\n");
      out.write("                height=20></TD>\r\n");
      out.write("            <TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_021.jpg\"\r\n");
      out.write("                              border=0></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("    <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=15 background=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_022.jpg><IMG\r\n");
      out.write("                    src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_022.jpg\" border=0></TD>\r\n");
      out.write("            <TD vAlign=top width=\"100%\" bgColor=#ffffff>\r\n");
      out.write("                <TABLE cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD class=manageHead>当前位置：统计分析 &gt; 级别统计</TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD height=2></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                </TABLE>\r\n");
      out.write("                <TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0\r\n");
      out.write("                       width=\"100%\" align=center border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD>\r\n");
      out.write("                            <TABLE id=grid\r\n");
      out.write("                                   style=\"BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc\"\r\n");
      out.write("                                   cellSpacing=1 cellPadding=2 rules=all border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("                                <TR\r\n");
      out.write("                                        style=\"FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none\">\r\n");
      out.write("                                    <TD>客户级别</TD>\r\n");
      out.write("                                    <TD>客户数量</TD>\r\n");
      out.write("                                </TR>\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                </TBODY>\r\n");
      out.write("                            </TABLE>\r\n");
      out.write("                        </TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("\r\n");
      out.write("                    <TR>\r\n");
      out.write("                        <TD><SPAN id=pagelink>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<DIV\r\n");
      out.write("                                                    style=\"LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t共[<B>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</B>]条记录,[<B>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</B>]页\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t,当前第[<b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b>]页\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t[<A href=\"javascript:to_page(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\">前一页</A>]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t[<A href=\"javascript:to_page(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\">后一页</A>] \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" size=\"3\" id=\"page\"\r\n");
      out.write("                                                       name=\"page\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</DIV>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</SPAN></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    </TBODY>\r\n");
      out.write("                </TABLE>\r\n");
      out.write("            </TD>\r\n");
      out.write("            <TD width=15 background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_023.jpg\"><IMG\r\n");
      out.write("                    src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_023.jpg\" border=0></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("    <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("            <TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_024.jpg\"\r\n");
      out.write("                              border=0></TD>\r\n");
      out.write("            <TD align=middle width=\"100%\"\r\n");
      out.write("                background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_025.jpg\" height=15></TD>\r\n");
      out.write("            <TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_026.jpg\"\r\n");
      out.write("                              border=0></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/customer/listLevel.jsp(73,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/customer/listLevel.jsp(73,32) '${list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/customer/listLevel.jsp(73,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("map");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <TR\r\n");
          out.write("                                            style=\"FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none\">\r\n");
          out.write("                                        <TD>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</TD>\r\n");
          out.write("                                        <TD>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.dname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</TD>\r\n");
          out.write("                                        </TD>\r\n");
          out.write("                                    </TR>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
