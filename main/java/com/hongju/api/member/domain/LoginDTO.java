package com.hongju.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoginDTO {
    private String username;
    private String password;


}
