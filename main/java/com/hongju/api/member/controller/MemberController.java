package com.hongju.api.member.controller;

import com.hongju.api.member.domain.CalcDTO;
import com.hongju.api.member.domain.GradeDTO;
import com.hongju.api.member.domain.LoginDTO;
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
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;

    @PostMapping("/calc")
   public String calc(@RequestBody CalcDTO calc){
       return service.calc(calc);

   }
   @PostMapping("/bmi")
   public String bmi(@RequestBody MemberDTO member){

        return service.bmi(member);
   }
    @PostMapping("/grade")
    public String grade(@RequestBody GradeDTO grade){

        return service.grade(grade);
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO login){

        return service.login(login);
    }

}
