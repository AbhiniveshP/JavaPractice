package com.designpatterns.strategy;

public class Demo {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("ABC", new JpegCompressor(), new BWFilter());
        imageStorage.store("ABC", new PngCompressor(), new HighContrastFilter());

        System.out.println();

        ChatClient chatClient = new ChatClient();
        chatClient.send("chat message", new AESEncryptionAlgorithm());
        chatClient.send("chat message", new DESEncryptionAlgorithm());
    }
}
