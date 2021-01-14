package com.example.demo2.command;

import com.example.demo2.command.impl.LoginCommand;
import com.example.demo2.command.impl.LogoutCommand;
import com.example.demo2.command.impl.OpenRegisterCommand;
import com.example.demo2.command.impl.RegisterCommand;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    REGISTER {
        {
            this.command = new RegisterCommand();
        }
    },
    OPENREGISTER {
        {
            this.command = new OpenRegisterCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
