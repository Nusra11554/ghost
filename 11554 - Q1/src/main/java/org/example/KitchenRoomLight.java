package org.example;

public class KitchenRoomLight implements Light {

    private int brightnessLevel=100;




    @Override
    public void on() {
        int brightnessLevel = 100;
        System.out.println("Kitchen Room Light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Light is now OFF");
    }

    @Override
    public void dim(int level) {

            brightnessLevel = level;
            System.out.println("Kitchen Room light dimmed to" + level+ "%");

    }

    @Override
    public void brightnessLevel() {

    }
}
