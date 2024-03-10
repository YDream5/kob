package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyj
 * @version 1.0
 */
//这里应该是创建的第二个文件，第一个是hel打算返回页面，
// 但似乎无法成功,这个开始返回数据，如字符串，列表等
@RestController
@RequestMapping("/pk/")
public class MyHeController {

    @RequestMapping("hhh/")
    public String hello(){
        return "hhh";
    }
}
