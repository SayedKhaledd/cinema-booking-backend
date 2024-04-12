package com.example.usermanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.usermanagement.transformer.mapper.UserMapper;
import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.model.User;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class UserTransformer implements AbstractTransformer<User, UserDto, UserMapper> {

    private final UserMapper userMapper;

    @Override
    public UserMapper getMapper() {
        return userMapper;
    }


}
