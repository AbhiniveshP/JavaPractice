package com.codewithmosh.oop.mytube;

public class VideoDatabase implements IVideoDatabase {

    @Override
    public void store(Video video) {
        System.out.println("Storing Video...");
        System.out.println("Done storing\n");
    }
}
