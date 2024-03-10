package com.shoppingmallproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prd")
public class ProductController {

    @GetMapping("/best")
    public String bestPrd(){
        return "bestPrd";
    }
    @GetMapping("/sale")
    public String salePrd(){
        return "salePrd";
    }
    @GetMapping("/new")
    public String newPrd(){
        return "newPrd";
    }
    @GetMapping("/benefit")
    public String benefitPrd(){
        return "benefitPrd";
    }
}
