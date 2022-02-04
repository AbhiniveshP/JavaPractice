package com.codewithmosh.oop.mytube;

public class VideoProcessor {

    private IVideoEncoder encoder;
    private IVideoDatabase database;
    private NotificationService notificationService;
    public VideoProcessor(IVideoEncoder encoder, IVideoDatabase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}
