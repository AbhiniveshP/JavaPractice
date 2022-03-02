package com.designpatterns.strategy;

public class ChatClient {

    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        String encryptedMessage = encryptionAlgorithm.encryptMessage(message);
        System.out.println("Sending the encrypted message..." + encryptedMessage);
    }
}
