package com.designpatterns.mediator.signupui;

public class TextBoxUsername extends UIControl {

    private String username = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyEventHandlers();
    }
}
