package com.designpatterns.mediator.signupui;

public class TextBoxPassword extends UIControl {

    private String password = "";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyEventHandlers();
    }
}
