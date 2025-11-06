package com.shlok.job_portal.service;


import com.shlok.job_portal.dto.UserCreateRequest;
import com.shlok.job_portal.dto.UserResponse;
import org.springframework.http.ResponseEntity;

public interface UserService {

    UserResponse createUser(UserCreateRequest request);
    UserResponse getUserById(Long id);

}
