package com.company.cakesite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getSignUpForm() {
        return "signUpForm";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String saveUser() {
        return "result";
    }

}
