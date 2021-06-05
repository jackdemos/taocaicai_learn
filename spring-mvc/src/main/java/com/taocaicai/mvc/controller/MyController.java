package com.taocaicai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

  @RequestMapping("/test.do")
  public ModelAndView index() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("msg", "mvc.do");
    modelAndView.addObject("func", "index");
    modelAndView.setViewName("test.jsp");
    return modelAndView;
  }

  @RequestMapping("/home")
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("msg", "首页");
    modelAndView.addObject("func", "home");
    modelAndView.setViewName("test.jsp");
    return modelAndView;
  }
}
