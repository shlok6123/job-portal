package com.shlok.job_portal.service;

import com.shlok.job_portal.Entity.User;
import com.shlok.job_portal.Repository.UserRepo;
import com.shlok.job_portal.dto.UserCreateRequest;
import com.shlok.job_portal.dto.UserResponse;
import com.shlok.job_portal.exception.EmailAlreayExsistsException;
import com.shlok.job_portal.exception.NotFoundException;
import com.shlok.job_portal.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserResponse createUser(UserCreateRequest request) {

        if(userRepo.exsistByEmail(request.getEmail())){
            throw new EmailAlreayExsistsException("User is Already Present: ");
        }

        String hashPassword=request.getPassword();

        User user= UserMapper.toEntity(request,hashPassword);

        User saved=userRepo.save(user);

        return UserMapper.toResponse(saved);
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
        return UserMapper.toResponse(user);
    }
}
