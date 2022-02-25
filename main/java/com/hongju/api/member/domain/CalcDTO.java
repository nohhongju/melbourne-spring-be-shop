package com.hongju.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalcDTO {

    private int num1;
    private String opcode;
    private int num2;

}
