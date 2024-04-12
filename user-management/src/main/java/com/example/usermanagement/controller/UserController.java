package com.example.usermanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.service.UserService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController implements AbstractController<UserService, UserDto> {

    private final UserService userService;


    @Override
    public UserService getService() {
        return userService;
    }





}
