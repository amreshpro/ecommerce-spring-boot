package com.amreshpro.ecommerce.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/id")
    String getId(HttpServletRequest request) {
        return request.getSession().getId();
    }

}
