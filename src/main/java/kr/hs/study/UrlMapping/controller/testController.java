package kr.hs.study.UrlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub3")
public class testController {
    @GetMapping("/test3")
    public String test3() {
        return "sub3/test3";
    }
    @GetMapping("/test4")
    public String test4() {
        return "sub3/test4";
    }
    @GetMapping("/test5")
    public String test5() {
        return "sub3/test5";
    }
}
