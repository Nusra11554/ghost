package org.example;

import org.example.*;

public class RemoteControlTest {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(2);
        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight,50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight,30);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasProssed(0);
        remoteControl.undoButtonWasProssed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasProssed(1);
        remoteControl.undoButtonWasProssed();

        kitchenLightDim.execute();
        kitchenLightDim.undo();

       livingRoomLightDim.execute();
       livingRoomLightDim.undo();




    }
}