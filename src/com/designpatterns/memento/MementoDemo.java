package com.designpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {
        var editor = new Editor();
        var document = new Document();
        var history = new History();

//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.restore((EditorState) history.pop());
        document.setContent("c1");
        document.setFontName("fn1");
        document.setFontSize(1);
        history.push(document.createState());

        document.setFontSize(2);
        history.push(document.createState());

        document.setFontName("fn2");
        history.push(document.createState());

        document.setContent("c2");
        history.push(document.createState());

        document.restore((DocumentState) history.pop());
        System.out.println(document);

        document.restore((DocumentState) history.pop());
        System.out.println(document);

        document.restore((DocumentState) history.pop());
        System.out.println(document);

        document.restore((DocumentState) history.pop());
        System.out.println(document);

//        System.out.println(editor.getContent());
    }
}
