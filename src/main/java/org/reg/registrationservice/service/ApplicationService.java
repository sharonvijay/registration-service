package org.reg.registrationservice.service;

import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;
import org.reg.registrationservice.repository.AdminRepo;
import org.reg.registrationservice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService implements IAdminService,IUserService{
    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }


    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
