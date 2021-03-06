package com.designpatterns.mediator.signupui;

public class CheckBox extends UIControl {

    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        notifyEventHandlers();
    }
}
