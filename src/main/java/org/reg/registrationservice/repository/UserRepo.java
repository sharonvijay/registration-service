package org.reg.registrationservice.repository;

import org.reg.registrationservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
