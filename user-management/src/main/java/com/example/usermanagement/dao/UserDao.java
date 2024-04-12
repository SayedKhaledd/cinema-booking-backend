package com.example.usermanagement.dao;

import com.example.usermanagement.model.User;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.usermanagement.dao.repo.UserRepo;

public interface UserDao extends AbstractDao<User, UserRepo> {
    // Define additional DAO methods here
}
