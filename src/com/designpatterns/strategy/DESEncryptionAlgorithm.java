package com.designpatterns.strategy;

public class DESEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encryptMessage(String message) {
        return "Encrypted message: " + message + " using DES";
    }
}
