package com.hongju.api.member.repository;

import com.hongju.api.member.domain.CalcDTO;
import com.hongju.api.member.domain.GradeDTO;
import com.hongju.api.member.domain.LoginDTO;
import com.hongju.api.member.domain.MemberDTO;

/**
 * packageName        : com.hongju.api.member.repository
 * fileName           : MemberRepository
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO member);

    String grade(GradeDTO grade);

    String login(LoginDTO login);
}
