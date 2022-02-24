package com.hongju.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName        : com.hongju.api.member.domain
 * fileName           : MemberDTO
 * author             : nohhongju
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11    nohhongju    최초 생성
 */
@Data
@Component
public class MemberDTO {

    private String userid;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String regdate;

}
