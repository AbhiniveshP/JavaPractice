package com.designpatterns.command;

import com.designpatterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black & White Command!");
    }
}
