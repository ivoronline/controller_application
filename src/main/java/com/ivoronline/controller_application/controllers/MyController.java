package com.ivoronline.controller_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @RequestMapping("Hello")
  String hello() {
    return "Test";
  }

}
