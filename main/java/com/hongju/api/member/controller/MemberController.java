package com.hongju.api.member.controller;

import com.hongju.api.member.domain.MemberDTO;
import com.hongju.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName        : com.hongju.api.member.controller
 * fileName           : MemberController
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight){
        System.out.println("리액트에서 넘어온 이름 : "+ name);
        System.out.println("리액트에서 넘어온 키 : "+ height);
        System.out.println("리액트에서 넘어온 몸무게 : "+ weight);

        return "BMI 는 정상";

    }
}
