package com.designpatterns.state;

public class CanvasDemo {

    public static void main(String[] args) {
        var canvas = new Canvas();
//        canvas.setTool(new SelectionTool());
//        canvas.setTool(new BrushTool());
        canvas.setTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
