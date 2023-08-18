package com.mantu.InstagramBackendApp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpOutput {
    private Boolean signupStatus;
    private String signupStatusMessage;
}
