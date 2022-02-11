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
    void membershipList(Scanner scanner);
    void membershipInformation(Scanner scanner);
    void checkTheList(Scanner scanner);
    void registerToSendEMails(Scanner scanner);
    void savingMoneyList(Scanner scanner);
    void savingMoneyList(Scanner scanner);


}
