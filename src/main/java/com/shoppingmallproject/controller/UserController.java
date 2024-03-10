package com.shoppingmallproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/signUp")
    public String singUp() {
        return "signUpForm";
    }

    @GetMapping("/myPage")
    public String myPage() {
        return "myPage";
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }
}
