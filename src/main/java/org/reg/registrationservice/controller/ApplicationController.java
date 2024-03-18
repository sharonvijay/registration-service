package org.reg.registrationservice.controller;

import org.reg.registrationservice.dto.UserAdminDto;
import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;
import org.reg.registrationservice.mapper.UserAdminMap;
import org.reg.registrationservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private UserAdminMap userAdminMap;


    @PostMapping("/addUser")
    public User addUser(@RequestBody UserAdminDto user)
    {
        User tempuser= userAdminMap.userMapping(user);
        return applicationService.addUser(tempuser);
    }

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody UserAdminDto admin)
    {
        Admin tempAdmin= userAdminMap.adminMapping(admin);
        return applicationService.addAdmin(tempAdmin);
    }


    @GetMapping("/allUser")
    public List<User> getAllUser()
    {
        return applicationService.getAllUser();
    }
}
