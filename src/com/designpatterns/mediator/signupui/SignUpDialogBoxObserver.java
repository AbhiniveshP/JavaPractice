package com.designpatterns.mediator.signupui;

public class SignUpDialogBoxObserver {

    private TextBoxUsername textBoxUsername = new TextBoxUsername();
    private TextBoxPassword textBoxPassword = new TextBoxPassword();
    private CheckBox checkBox = new CheckBox();
    private SignUpButton button = new SignUpButton();

    public SignUpDialogBoxObserver() {
        textBoxUsername.addEventHandlers(this::controlUpdated);
        textBoxPassword.addEventHandlers(this::controlUpdated);
        checkBox.addEventHandlers(this::controlUpdated);
    }

    public void simulateUserAction() {
        textBoxUsername.setUsername("Abhinivesh");
        System.out.println("Username: " + textBoxUsername.getUsername());
        System.out.println("Password: " + textBoxPassword.getPassword());
        System.out.println("Terms Agreed?: " + checkBox.isChecked());
        System.out.println("Sign Up Enabled?: " + button.isEnabled());
        System.out.println();

        textBoxPassword.setPassword("Abhinivesh");
        System.out.println("Username: " + textBoxUsername.getUsername());
        System.out.println("Password: " + textBoxPassword.getPassword());
        System.out.println("Terms Agreed?: " + checkBox.isChecked());
        System.out.println("Sign Up Enabled?: " + button.isEnabled());
        System.out.println();

        checkBox.setChecked(true);
        System.out.println("Username: " + textBoxUsername.getUsername());
        System.out.println("Password: " + textBoxPassword.getPassword());
        System.out.println("Terms Agreed?: " + checkBox.isChecked());
        System.out.println("Sign Up Enabled?: " + button.isEnabled());
        System.out.println();

        textBoxPassword.setPassword("");
        System.out.println("Username: " + textBoxUsername.getUsername());
        System.out.println("Password: " + textBoxPassword.getPassword());
        System.out.println("Terms Agreed?: " + checkBox.isChecked());
        System.out.println("Sign Up Enabled?: " + button.isEnabled());
        System.out.println();
    }

    private void controlUpdated() {
        boolean isAnyTextBoxEmpty = textBoxUsername.getUsername().isEmpty() ||
            textBoxPassword.getPassword().isEmpty();
        boolean canButtonBeEnabled = !isAnyTextBoxEmpty && checkBox.isChecked();
        button.setEnabled(canButtonBeEnabled);
    }
}
