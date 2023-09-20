package com.example.hotel_indi_project.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
    private static final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    private PasswordEncoderUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static BCryptPasswordEncoder getInstance() {
        return PASSWORD_ENCODER;
    }
}
