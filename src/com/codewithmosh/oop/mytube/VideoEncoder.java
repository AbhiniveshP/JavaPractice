package com.codewithmosh.oop.mytube;

public class VideoEncoder implements IVideoEncoder{

    @Override
    public void encode(Video video) {
        System.out.println("Encoding Video...");
        System.out.println("Done encoding\n");
    }
}
