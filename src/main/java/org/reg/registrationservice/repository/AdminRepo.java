package org.reg.registrationservice.repository;

import org.reg.registrationservice.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long>
{
    Admin findByEmail(String email);
}
