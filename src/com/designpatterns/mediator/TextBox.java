package com.designpatterns.mediator;

public class TextBox extends UIControl {

    private String content;

    public TextBox(DialogBox ownerDialogBox) {
        super(ownerDialogBox);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        ownerDialogBox.changed(this);
    }
}
