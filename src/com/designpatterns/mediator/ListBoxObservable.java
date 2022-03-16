package com.designpatterns.mediator;

public class ListBoxObservable extends UIControlObservable {

    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
