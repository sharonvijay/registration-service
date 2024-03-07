package org.reg.registrationservice.service;

import org.reg.registrationservice.entity.Admin;
import org.reg.registrationservice.entity.User;

import java.util.List;


public interface IAdminService {
    public Admin addAdmin(Admin admin);
    public List<User> getAllUser();
}
