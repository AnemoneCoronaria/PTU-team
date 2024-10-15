package com.PTUproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/")
    public String main() {      //시작 화면
        return "main";
    }

    //밑에 3개가 상단 메뉴
    @GetMapping("/smellGroup")
    public String smellGroup() {
            return "smellGroup";
    }

    @GetMapping("/website")
    public String website() {
        return "website";
    }

    @GetMapping("/sell")
    public String sell() {
        return "sell";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
