package com.example.controller;

import com.example.domain.Info;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/10 15:54
 * 创建描述：
 *
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/hello")
    private String index() {

        Info info = customerService.findAll();
        System.out.println(info);
        return "Hello Worldadfdd";
    }

}
