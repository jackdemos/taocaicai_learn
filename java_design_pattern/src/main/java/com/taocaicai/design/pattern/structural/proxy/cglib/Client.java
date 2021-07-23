package com.taocaicai.design.pattern.structural.proxy.cglib;

/**
 * @project taocaicai_learn
 * @author Oakley
 * @created 2021-07-24 04:51:4:51
 * @package com.taocaicai.design.pattern.structural.proxy.cglib
 * @description TODO
 * @version: 0.0.0.1
 */
public class Client {

  public static void main(String[] args) {
    CglibProxy cglibProxy = new CglibProxy();
    HelloService service = (HelloService) cglibProxy.creatProxyObj(HelloService.class);
    String result = service.hello("Oakley");
    System.out.println("调用返回结果:\t" + result);
    System.out.println("当前IP地址:\t"+service.getIP());
  }
}
