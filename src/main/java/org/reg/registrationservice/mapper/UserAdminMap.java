package org.reg.registrationservice.mapper;

import org.reg.registrationservice.dto.UserAdminDto;
import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserAdminMap {
    public User userMapping(UserAdminDto userDto)
    {
        User user = User.builder().name(userDto.getName()).email(userDto.getEmail()).password(userDto.getPassword()).phoneNo(userDto.getPhoneNo()).build();
        return user;
    }

    public Admin adminMapping(UserAdminDto adminDto)
    {
        Admin admin = Admin.builder().name(adminDto.getName()).email(adminDto.getEmail()).password(adminDto.getPassword()).phoneNo(adminDto.getPhoneNo()).build();
        adminDto.setIsAdmin(true);
        return admin;
    }

}
