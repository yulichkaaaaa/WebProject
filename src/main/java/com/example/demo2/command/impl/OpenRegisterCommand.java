package com.example.demo2.command.impl;

import com.example.demo2.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class OpenRegisterCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = "/jsp/register.jsp";
        request.getSession().invalidate();
        return page;
    }
}
