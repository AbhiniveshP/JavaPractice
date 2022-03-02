package com.designpatterns.strategy;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encryptMessage(String message) {
        return "Encrypted message: " + message + " using AES";
    }
}
