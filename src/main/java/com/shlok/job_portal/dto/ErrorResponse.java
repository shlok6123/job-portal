package com.shlok.job_portal.dto;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ErrorResponse {
    private Instant timestamp;     // Instant.now()
    private String path;           // request URI
    private int status;            // HTTP status code
    private String message;        // human-readable message
    private List<String> errors;   // optional: field-level errors
}
