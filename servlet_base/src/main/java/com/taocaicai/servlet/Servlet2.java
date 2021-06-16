package com.taocaicai.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 implements Servlet {

  private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  @Override
  public void init(ServletConfig config) throws ServletException {}

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    String date = df.format(new Date());
    /*设置编码*/
    res.setCharacterEncoding("GBK");
    res.getWriter().write("当前时间:\t" + date);
  }

  @Override
  public String getServletInfo() {
    return null;
  }

  @Override
  public void destroy() {}
}
