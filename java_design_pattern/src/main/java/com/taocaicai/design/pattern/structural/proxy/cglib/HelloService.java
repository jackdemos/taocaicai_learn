package com.taocaicai.design.pattern.structural.proxy.cglib;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-07-24 04:50:4:50
 * @package com.taocaicai.design.pattern.structural.proxy.cglib
 * @description TODO
 * @version: 0.0.0.1
 */
public class HelloService {
  public String hello(String name) {
    System.out.println("接收到的调用参数:\t" + name);
    return "Hello " + name;
  }

  public String getIP() {
    try {
      InetAddress localHost = Inet4Address.getLocalHost();
      System.out.println(localHost.getHostAddress());
      return localHost.getHostAddress();
    } catch (UnknownHostException e) {
      e.printStackTrace();
      return null;
    }
  }
}
