package com.shlok.job_portal.mapper;

import com.shlok.job_portal.Entity.User;
import com.shlok.job_portal.dto.UserCreateRequest;
import com.shlok.job_portal.dto.UserResponse;

import java.time.Instant;
import java.time.LocalTime;

public class UserMapper {

   public static User toEntity(UserCreateRequest request,String hashPassword){
       User user=new User();

       user.setName(request.getName());
       user.setEmail(request.getEmail());
       user.setPassword(hashPassword);
       user.setRole(request.getRole());
       user.setCreatedAt(LocalTime.now());

       return user;
   }

   public static UserResponse toResponse(User user){
       return UserResponse.builder().
               id(user.getId())
               .name(user.getName())
               .email(user.getEmail())
               .role(user.getRole())
               .createdAt(Instant.from(user.getCreatedAt()))
               .build();
   }
}
