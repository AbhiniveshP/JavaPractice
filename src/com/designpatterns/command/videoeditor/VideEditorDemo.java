package com.designpatterns.command.videoeditor;

public class VideEditorDemo {

    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        History history = new History();

        SetTextCommand setTextCommand = new SetTextCommand(videoEditor, history, "Video Title");
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new SetContrastCommand(videoEditor, history, 1);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

    }
}
