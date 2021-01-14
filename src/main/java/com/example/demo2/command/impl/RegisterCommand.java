package com.example.demo2.command.impl;

import com.example.demo2.command.ActionCommand;
import com.example.demo2.service.UserService;

import javax.servlet.http.HttpServletRequest;

public class RegisterCommand implements ActionCommand {

    private static final String PARAM_NAME = "name";
    private static final String PARAM_LOGIN = "login";
    private static final String PARAM_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        UserService service = new UserService();
        String name = request.getParameter(PARAM_NAME);
        String login = request.getParameter(PARAM_LOGIN);
        String pass = request.getParameter(PARAM_PASSWORD);
        service.registerUser(name, login, pass);
        page = "/jsp/login.jsp";
        return page;
    }
}
