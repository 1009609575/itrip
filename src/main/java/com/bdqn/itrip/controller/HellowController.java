package com.bdqn.itrip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName:HellowController
 *@Description:测试SpringBOOT自动
 *@Author:lzq
 *@Date: 2019/9/11 12:26
 **/
@RestController
@RequestMapping("/hello")
public class HellowController {
    @GetMapping("index")
    private String index(){
        return "性器家带傻逼 狗屎人带孝子";
    }
}
