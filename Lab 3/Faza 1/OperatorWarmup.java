public class OperatorWarmup {
    public static void main(String[] args) {
        int a = 17, b = 5, c = 2;

        System.out.println("Numri a: " + a);
        System.out.println("Numri b: " + b);
        System.out.println("Numri c: " + c);

        System.out.println("\n");
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n");
        System.out.println("Para: b = " + b);
        int r = b++ * c;
        System.out.println("r = b++ * c = " + r);
        System.out.println("Pas b++: b = " + b);

        System.out.println("r = ++b * c = " + r);
        System.out.println("Pas ++b: b = " + b);

    }
}
