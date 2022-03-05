package com.designpatterns.command.videoeditor;

public class SetTextCommand extends AbstractUndoableCommand {

    private String text;

    public SetTextCommand(VideoEditor videoEditor, History history, String text) {
        super(videoEditor, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
