package com.letcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TESZ-RD-07 on 2018/5/11.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
