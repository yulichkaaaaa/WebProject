package com.example.demo2.command.impl;

import com.example.demo2.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/jsp/login.jsp";
        request.getSession().invalidate();
        return page;
    }
}
