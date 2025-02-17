import java.sql.SQLOutput;
import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)?");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Do you want extras with your coffee (yes/no)?");
        boolean coffeeExtras = scanner.nextLine().trim().equals("yes");

        Beverage tea = new Tea();
        tea.setWantsExtras(teaExtras);
        Beverage coffee = new Coffee();
        coffee.setWantsExtras(coffeeExtras);

        System.out.println("Making tea...");
        tea.finalTempleMethod();

        System.out.println("\nMaking coffee");
        coffee.finalTempleMethod();

        scanner.close();

    }
}