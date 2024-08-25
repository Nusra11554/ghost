public abstract class Beverage {

    private boolean wantsExtras;

    public final void finalTempleMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }

    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public abstract void brew();
    public abstract void addCondiments();
    public abstract void addExtras();


    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }




}
