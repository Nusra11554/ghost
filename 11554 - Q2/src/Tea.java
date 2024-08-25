public class Tea extends Beverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void addExtras() {
        System.out.println("adding honey as extra");
    }
}
