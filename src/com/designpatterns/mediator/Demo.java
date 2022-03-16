package com.designpatterns.mediator;

import com.designpatterns.mediator.signupui.SignUpDialogBoxObserver;

public class Demo {

    public static void main(String[] args) {

//        ArticlesDialogBox articlesDialogBox = new ArticlesDialogBox();
//        articlesDialogBox.simulateUserAction();

//        ArticleDialogBoxObserver articleDialogBoxObserver = new ArticleDialogBoxObserver();
//        articleDialogBoxObserver.simulateUserAction();
        SignUpDialogBoxObserver signUpDialogBoxObserver = new SignUpDialogBoxObserver();
        signUpDialogBoxObserver.simulateUserAction();
    }
}
