package com.designpatterns.mediator;

public class ListBox extends UIControl {

    private String selection;

    public ListBox(DialogBox ownerDialogBox) {
        super(ownerDialogBox);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        ownerDialogBox.changed(this);
    }
}
