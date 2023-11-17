package com.kob.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyj
 * @version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hel")
    public String hello(){
        return "hel";

    }
}
