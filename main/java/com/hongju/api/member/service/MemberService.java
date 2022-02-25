package com.hongju.api.member.service;

import com.hongju.api.member.domain.CalcDTO;
import com.hongju.api.member.domain.GradeDTO;
import com.hongju.api.member.domain.LoginDTO;
import com.hongju.api.member.domain.MemberDTO;

import java.util.Scanner;

/**
 * packageName        : com.hongju.api.member.service
 * fileName           : MemberService
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
public interface MemberService {


    String calc(CalcDTO calc);


    String bmi(MemberDTO member);

    String grade(GradeDTO grade);

    String login(LoginDTO login);
}
