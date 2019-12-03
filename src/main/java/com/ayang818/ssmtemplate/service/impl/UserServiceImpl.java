package com.example.ssmThymeleaf.service.impl;

import com.example.ssmThymeleaf.mapper.UserMapper;
import com.example.ssmThymeleaf.model.User;
import com.example.ssmThymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
