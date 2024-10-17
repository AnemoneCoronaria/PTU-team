package com.PTUproject.service;

import com.PTUproject.dto.MemberDTO;
import com.PTUproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
@Transactional  //추가된 것
public class MemberService {
    private final MemberRepository memberRepository;    //의존성 주입

    public int save(MemberDTO memberDTO) {
        return memberRepository.save(memberDTO);
    }

    public boolean login(MemberDTO memberDTO, HttpSession session) {
        MemberDTO loginMember = memberRepository.login(memberDTO);

        if (loginMember != null) {
            session.setAttribute("loginEmail", loginMember.getMemberEmail()); // 이메일 저장
            return true;
        } else {
            return false;
        }

        //레파지토리에서 로그인 과정을 수행하고 결과를 DTO 객체로 받음
        //이후 결과가 null인지 판별
    }
}
