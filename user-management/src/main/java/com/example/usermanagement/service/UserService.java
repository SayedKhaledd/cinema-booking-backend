package com.example.usermanagement.service;

import com.example.usermanagement.model.User;
import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.transformer.UserTransformer;
import com.example.usermanagement.dao.UserDao;
import com.example.backendcoreservice.service.AbstractService;

public interface UserService extends AbstractService<User, UserDto, UserTransformer, UserDao> {

}
