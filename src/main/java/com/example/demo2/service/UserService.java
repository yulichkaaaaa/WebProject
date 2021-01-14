package com.example.demo2.service;

import com.example.demo2.dao.UserDao;
import com.example.demo2.entity.User;
import com.example.demo2.service.validator.EmailValidator;
import com.example.demo2.service.validator.PasswordValidator;

public class UserService {
    private UserDao userDao;

    public UserService(){
        userDao = new UserDao();
    }

    public User loginUser(String email, String password){
        if(!PasswordValidator.isPassword(password) || !EmailValidator.isEmail(email)){
            return null;
        }
        User user = new User(email, password);
        return userDao.login(user);
    }

    public void registerUser(String name, String email, String password){
        User user = new User(name, email, password, "user");
        userDao.register(user);
    }
}
