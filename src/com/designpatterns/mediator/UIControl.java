package com.designpatterns.mediator;

public class UIControl {

    protected DialogBox ownerDialogBox;

    public UIControl(DialogBox ownerDialogBox) {
        this.ownerDialogBox = ownerDialogBox;
    }
}
