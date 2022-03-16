package com.designpatterns.mediator;

public class TextBoxObservable extends UIControlObservable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
