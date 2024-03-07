package org.reg.registrationservice.controller;

import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;
import org.reg.registrationservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return applicationService.addUser(user);
    }

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin)
    {
        return applicationService.addAdmin(admin);
    }


    @GetMapping("/allUser")
    public List<User> getAllUser()
    {
        return applicationService.getAllUser();
    }
}
