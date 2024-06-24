package org.reg.registrationservice.service;

import org.reg.registrationservice.entity.User;
import java.util.Optional;

public interface IUserService {

    public User addUser(User user);

    Optional<User> existingUser(String email);


}
