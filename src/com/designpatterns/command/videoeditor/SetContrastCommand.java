package com.designpatterns.command.videoeditor;

public class SetContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;
    private float contrast;

    public SetContrastCommand(VideoEditor videoEditor, History history, float contrast) {
        super(videoEditor, history);
        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
