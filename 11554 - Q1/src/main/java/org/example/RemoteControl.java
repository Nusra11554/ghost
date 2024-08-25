package org.example;

public class RemoteControl {
    private final int i;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;


    public RemoteControl(int i) {
        this.i=i;
        onCommands = new Command[i];
        offCommands = new Command[i];

    }

    public void onButtonWasPressed(int i) {

       onCommands [i].execute();
       undoCommand = onCommands [i];
    }

    public void setCommand(int i, Command onCommand, Command offCommand) {

        onCommands [i] = onCommand;
        offCommands [i] = offCommand;
    }

    public void offButtonWasProssed(int i) {

        offCommands [i].execute();
        undoCommand = offCommands [i];
    }

    public void undoButtonWasProssed() {

        undoCommand.undo();
    }




}
