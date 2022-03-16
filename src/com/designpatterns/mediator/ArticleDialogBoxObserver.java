package com.designpatterns.mediator;

public class ArticleDialogBoxObserver {

    private ListBoxObservable articlesListBox = new ListBoxObservable();
    private TextBoxObservable titlesTextBox = new TextBoxObservable();
    private ButtonObservable saveButton = new ButtonObservable();

    public ArticleDialogBoxObserver() {
        articlesListBox.attachEventHandler( this::articleSelected );
        titlesTextBox.attachEventHandler( this::titleChanged );
    }

    public void simulateUserAction() {
        System.out.println();
        articlesListBox.setSelection("Article 1");
        System.out.println("Titles Text Box Content:: " + titlesTextBox.getContent());
        System.out.println("Save Button Enabled:: " + saveButton.isEnabled());

        System.out.println();
        titlesTextBox.setContent("");
        System.out.println("Titles Text Box Content:: " + titlesTextBox.getContent());
        System.out.println("Save Button Enabled:: " + saveButton.isEnabled());

        System.out.println();
        articlesListBox.setSelection("Article 2");
        System.out.println("Titles Text Box Content:: " + titlesTextBox.getContent());
        System.out.println("Save Button Enabled:: " + saveButton.isEnabled());
    }


    private void titleChanged() {
        boolean isContentEmpty = titlesTextBox.getContent() == null || titlesTextBox.getContent().isEmpty();
        saveButton.setEnabled(!isContentEmpty);
    }

    private void articleSelected() {
        titlesTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
