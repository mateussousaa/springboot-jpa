package com.learning.course.config;

import com.learning.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")

public class TestConfig {

    @Autowired
    private UserRepository userRepository;
}
