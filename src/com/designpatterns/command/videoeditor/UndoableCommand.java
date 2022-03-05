package com.designpatterns.command.videoeditor;

public interface UndoableCommand extends Command {
    void undo();
}
