package com.example.pwmanager.controller;

import com.example.pwmanager.dtos.RegisterDto;
import com.example.pwmanager.responses.RegisterResponse;
import com.example.pwmanager.responses.TakenResponse;
import com.example.pwmanager.service.UserService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class UserController {


    private final  UserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> registerUser(@RequestBody RegisterDto registerDto){
    return userService.registerUserWithRole(userDto);
    }

    @GetMapping("/check-email/{email}")
    public ResponseEntity<TakenResponse> checkEmail(@PathVariable String email){
        return userService.checkEmail(email);
    }

    @GetMapping("/check-username/{username}")
    public ResponseEntity<TakenResponse> checkUsername(@PathVariable String username){
        return userService.checkUsername(username);
    }
}