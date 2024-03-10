package com.kob.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyj
 * @version 1.0
 */

//发现只有restcontroller才能返回信息好像，controller是页面
@RestController
public class HelloController {

  @RequestMapping("/hello")
    public String hello(){
 //   return "hel";
  return "index.html";//好像返回不了html

    }
}
