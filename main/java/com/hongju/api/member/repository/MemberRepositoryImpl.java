package com.hongju.api.member.repository;

import com.hongju.api.member.domain.CalcDTO;
import com.hongju.api.member.domain.GradeDTO;
import com.hongju.api.member.domain.LoginDTO;
import com.hongju.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName        : com.hongju.api.member.repository
 * fileName           : MemberRepositoryImpl
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO member) {
        return null;
    }

    @Override
    public String grade(GradeDTO grade) {
        return null;
    }

    @Override
    public String login(LoginDTO login) {
        return null;
    }
}
