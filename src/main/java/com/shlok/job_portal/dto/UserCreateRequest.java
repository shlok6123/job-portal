package com.shlok.job_portal.dto;

import com.shlok.job_portal.dto.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class UserCreateRequest {

    @NotBlank
    @Size(min = 2, max = 60)
    private String name;

    @NotBlank
    @Email
    private String email;

    // We’ll hash this in the service. Never return it.
    @NotBlank
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    @NotNull
    private Role role;
}
