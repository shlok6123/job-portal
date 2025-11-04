package com.shlok.job_portal.Repository;

import com.shlok.job_portal.Entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface UserRepo extends JpaRepository<User,Long> {
    public Optional<User> findByEmail(String email);
    public Optional<User> exsistByEmail(String email);
}
