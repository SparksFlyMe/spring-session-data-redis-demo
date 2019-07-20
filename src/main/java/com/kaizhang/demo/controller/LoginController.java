package com.kaizhang.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ：kaizhang
 * @date ：2019/7/20 14:43
 * @description：
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    private static final String ATTRIBUTE_KEY =  "key";

    @RequestMapping("/setSession/{value}")
    public String setSession(@PathVariable("value") String value, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        session.setAttribute(ATTRIBUTE_KEY, value );
        return value;
    }

    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        String value = (String) session.getAttribute(ATTRIBUTE_KEY);
        return value;
    }
}
