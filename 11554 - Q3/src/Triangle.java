public class Triangle implements Shape {


    @Override
    public void draw() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }

    }
}