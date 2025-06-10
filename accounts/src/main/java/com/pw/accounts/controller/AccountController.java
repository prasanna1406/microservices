package com.pw.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    /**
     * @return a friendly hello world message
     */
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

}
