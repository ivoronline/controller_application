package com.ivoronline.controller_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @RequestMapping("/hello")
  public String sayHello() {
    System.out.println("Hello from sayHello()");
    return "test";
  }

}
