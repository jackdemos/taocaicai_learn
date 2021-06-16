package com.taocaicai.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** @author Oakley */
public class MyServlet implements Servlet {
  @Override
  public void init(ServletConfig config) throws ServletException {}

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    final Map<String, String[]> parameterMap = req.getParameterMap();
    parameterMap
        .keySet()
        .forEach(k -> System.out.println("parameters:\t" + parameterMap.get(k)[0]));
    PrintWriter printWriter = res.getWriter();
    printWriter.println("<html><title>myTest</title>");
    printWriter.println("<body><h1>Test Servlet</h1>");
    printWriter.println("<b>name: \t"+req.getParameter("name")+"</b>  <b>age:\t"+req.getParameter("age")+"</b>");
    printWriter.println("</body></html>");
    printWriter.flush();
    printWriter.close();
  }

  @Override
  public String getServletInfo() {
    return null;
  }

  @Override
  public void destroy() {}
}
