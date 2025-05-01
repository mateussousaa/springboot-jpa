package com.learning.course.resources;

import com.learning.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User("user", "user@mail.com", "5588999998888", "password");
        return ResponseEntity.ok().body(user);
    }
}
