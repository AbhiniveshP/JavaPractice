package com.designpatterns.state;

public class Canvas {

    private Tool tool;

    public void mouseUp() {
        tool.mouseUp();
    }

    public void mouseDown() {
        tool.mouseDown();
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
