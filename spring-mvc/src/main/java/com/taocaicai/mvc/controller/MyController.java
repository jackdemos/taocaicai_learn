package com.taocaicai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
public class MyController {

  /**
   * @return
   */
  @RequestMapping("/test.do")
  public ModelAndView index() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("msg", "mvc.do");
    modelAndView.addObject("func", "index");
    modelAndView.setViewName("test");
    return modelAndView;
  }

  @RequestMapping("/home")
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("msg", "首页");
    modelAndView.addObject("func", "home");
    modelAndView.setViewName("test");
    return modelAndView;
  }

  /**
   * @param request
   * @return
   */
  @RequestMapping("/ip")
  @ResponseBody
  public String getRemoteIP(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
    }
    System.out.println("用户请求的IP地址:\t" + ip);
    return ip;
  }
}
