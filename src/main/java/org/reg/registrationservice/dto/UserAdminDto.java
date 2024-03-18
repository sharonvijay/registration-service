package org.reg.registrationservice.dto;

import lombok.Data;

@Data
public class UserAdminDto {
    private String name;
    private Long phoneNo;
    private String email;
    private String password;
    private Boolean isAdmin=Boolean.FALSE;
}
