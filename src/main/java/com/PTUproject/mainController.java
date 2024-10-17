package com.PTUproject;

//import com.PTUproject.dto.MemberDTO;
import com.PTUproject.dto.MemberDTO;
import com.PTUproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class mainController {

    private final MemberService memberService;  //의존성을 주입함


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

    //로그인 관련 컨트롤러
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-tunnel")
    public String loginTunnel() {
        return "login-tunnel";
    }

    @PostMapping("/login")   //로그인 처리 ...  세션도 사용함
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
        boolean loginResult = memberService.login(memberDTO, session);

        if (loginResult) {
            session.getAttribute("loginEmail");
            return "good";  //로그인 성공하면 good.jsp 로 이동   참고로 good.jsp는 급조한 것이다.
        } else {
            return "login"; //실패하면 login.jsp 에 있도록 함
        }
    }

    //회원가입 관련 컨트롤러
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    //회원가입 툴 / MemberDTO와 연관있음
    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        int saveResult = memberService.save(memberDTO);
        if (saveResult > 0) {
            return "login-tunnel";
        } else {
            return "save";
        }
    }



}
