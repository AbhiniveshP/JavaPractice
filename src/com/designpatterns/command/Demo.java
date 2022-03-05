package com.designpatterns.command;

import com.designpatterns.command.editor.BoldCommand;
import com.designpatterns.command.editor.History;
import com.designpatterns.command.editor.HtmlDocument;
import com.designpatterns.command.editor.UndoCommand;
import com.designpatterns.command.fx.Button;
import com.designpatterns.command.fx.Command;

public class Demo {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Command command = new AddCustomerCommand(customerService);

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteCommand());

//        Button button = new Button(command);
        Button button = new Button(compositeCommand);
        button.click();

        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
