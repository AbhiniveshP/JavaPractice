package com.designpatterns.state;

public class DirectionServiceDemo {

    public static void main(String[] args) {
        var directionService = new DirectionService();
//        directionService.setTravelMode(new DrivingMode());
//        directionService.setTravelMode(new BicycleMode());
//        directionService.setTravelMode(new TransitMode());
        directionService.setTravelMode(new WalkingMode());
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getEta());
    }
}
