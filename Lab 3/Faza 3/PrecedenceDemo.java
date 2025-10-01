public class PrecedenceDemo {
    public static void main(String[] args) {
        int r1 = 10 + 2 * 5 - 6 / 3;
        System.out.println("r1 = " + r1);

        int r2 = ((10 + 2) * (5 - 6)) / 3;
        System.out.println("r2 = " + r2);

        int x = 3;
        int y = x++ + ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 5;
        double b = 2.0;
        System.out.println("5 / 2 (int) = " + (5 / 2));
        System.out.println("5 / 2.0 (double) = " + (5 / 2.0));
    }
}