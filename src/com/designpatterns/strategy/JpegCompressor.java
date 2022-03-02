package com.designpatterns.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file: " + fileName + " using JPEG Compressor");
    }
}
