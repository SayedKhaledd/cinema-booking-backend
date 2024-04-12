package com.example.usermanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.usermanagement.dao.UserDao;
import com.example.usermanagement.transformer.UserTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final UserTransformer userTransformer;

    @Override
    public UserDao getDao() {
        return userDao;
    }

    @Override
    public UserTransformer getTransformer() {
        return userTransformer;
    }
    



}
