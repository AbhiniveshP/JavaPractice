package com.designpatterns.mediator;

public class Button extends UIControl {

    private boolean isEnabled;

    public Button(DialogBox ownerDialogBox) {
        super(ownerDialogBox);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        ownerDialogBox.changed(this);
    }

}
