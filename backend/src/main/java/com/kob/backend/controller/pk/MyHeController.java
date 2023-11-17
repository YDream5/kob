package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyj
 * @version 1.0
 */
@RestController
@RequestMapping("/pk/")
public class MyHeController {

    @RequestMapping("hhh/")
    public String hello(){
        return "hhh";
    }
}
