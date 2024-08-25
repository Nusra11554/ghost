package org.example;

public class LightDimCommand implements Command{
    public Light light;
    private  int PreviousBrightness;
    private int CurrentBrightness;

    public LightDimCommand(Light light ,int level ) {
        this.light = light;
        this.CurrentBrightness=level;
    }

    @Override
    public void execute() {
        PreviousBrightness = 100;
        light.dim(CurrentBrightness);
    }

    @Override
    public void undo() {
        light.dim( PreviousBrightness);
    }
}
