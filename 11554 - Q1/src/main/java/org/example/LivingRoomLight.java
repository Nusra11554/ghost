package org.example;

public class LivingRoomLight implements Light{
    private int brightnessLevel;




    @Override
    public void on() {
        brightnessLevel=100;
        System.out.println("Living room light is now ON at full brightness.");
    }

    @Override
    public void off() {

        System.out.println("Living room light is now off.");
    }

    @Override
    public void dim(int level) {
            brightnessLevel = level;
            System.out.println("Living room light Dim to level" + level+"%");
        }
        @Override
        public void brightnessLevel(){




        }
    }




