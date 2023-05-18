package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/sub4/test6")
    public String test6() {
        return "sub4/test6";
    }
}
