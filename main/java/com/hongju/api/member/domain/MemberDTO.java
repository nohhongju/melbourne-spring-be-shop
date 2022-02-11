package com.hongju.api.member.domain;

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
public class MemberDTO {
    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    private String memId;
    private String memName;
    private int menNumber;
    private String add;
    private String phone1;
    private String phone2;
    private int height;

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMenNumber() {
        return menNumber;
    }

    public void setMenNumber(int menNumber) {
        this.menNumber = menNumber;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }

    private String debutDate;


    public MemberDTO(String memId, String memName, int menNumber, String add, String phone1, String phone2, int height, String debutDate) {
        this.memId = memId;
        this.memName = memName;
        this.menNumber = menNumber;
        this.add = add;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.height = height;
        this.debutDate = debutDate;
    }
}
