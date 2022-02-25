package com.hongju.api.member.service;

import com.hongju.api.member.controller.MemberController;
import com.hongju.api.member.domain.CalcDTO;
import com.hongju.api.member.domain.GradeDTO;
import com.hongju.api.member.domain.LoginDTO;
import com.hongju.api.member.domain.MemberDTO;
import com.hongju.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

/**
 * packageName        : com.hongju.api.member.service
 * fileName           : MemberServiceImpl
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private  final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = a / b; break;
            case "%": res = a % b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String bmi(MemberDTO member) {
        double res = member.getWeight() / (member.getHeight() * member.getHeight()) * 10000;
        String s = "";
        if (res >= 35) {
            s = "고도비만";
        }else if (res >= 30){
            s = "중(重)도 비만 (2단계 비만)";
        }else if (res >= 25){
            s = "경도 비만 (1단계 비만)";
        }else if (res >= 23){
            s = "과체중";
        }else if (res >= 18.5){
            s = "정산";
        }else {
            s = "저체중";
        }
        return String.format("%s",s);
    }

    @Override
    public String grade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String res = (avg >=60) ? "합격" : "불합격";
        return String.format("이름 : %s 국어 : %d 영어 : %d 수학 : %d 총점 : %d 평균 : %d 결과 : %s ",
                grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, res);
    }

    @Override
    public String login(LoginDTO login) {
        String res = "";
        String PASSWORD = "abc";
        switch (PASSWORD){
            case "abc" : res = String.format("로그인 성공"); break;
            default: res = String.format("ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", login.getPassword() ); break;
        }
        return res;
    }
}
