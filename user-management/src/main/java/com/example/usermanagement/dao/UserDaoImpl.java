package com.example.usermanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.usermanagement.dao.repo.UserRepo;

@Component
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private final UserRepo userRepo;

    @Override
    public UserRepo getRepo() {
        return userRepo;
    }


}
