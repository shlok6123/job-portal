package com.shlok.job_portal.dto;

import com.shlok.job_portal.dto.Role;
import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private Role role;
    private Instant createdAt;
}
