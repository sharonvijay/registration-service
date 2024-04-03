package org.reg.registrationservice.service;

import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;

import java.util.List;
import java.util.Optional;


public interface IAdminService {
    public Admin addAdmin(Admin admin);
    public List<User> getAllUser();
    Optional<Admin> existingAdmin(String email);

}
