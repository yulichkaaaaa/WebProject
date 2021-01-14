package com.example.demo2.command.impl;

import com.example.demo2.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/jsp/login.jsp";
        return page;

    }
}
