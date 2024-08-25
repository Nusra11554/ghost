public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee though filter");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding suger and milk");
    }

    @Override
    public void addExtras() {



        System.out.println("Adding vanilla syrup");
    }

}

