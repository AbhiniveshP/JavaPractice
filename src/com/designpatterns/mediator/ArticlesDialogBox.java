package com.designpatterns.mediator;

public class ArticlesDialogBox extends DialogBox {

    private ListBox articlesListBox = new ListBox(this);
    private TextBox titlesTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

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

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox)
            articleSelected();
        else if (control == titlesTextBox)
            titleChanged();
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
