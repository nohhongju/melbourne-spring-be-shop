package com.hongju.api.member.service;

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
    String membershipList();
    String membershipInformation();
    String checkTheList();
    String registerToSendEMails();
    String savingMoneyList();
    String CheckTheDetailsOfTheSavings();
    String calc();
    String bmi();
    String grade();


}
