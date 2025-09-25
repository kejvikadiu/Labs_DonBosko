public class CastingDemo {
    public static void main(String[] args) {

        int a = 100;
        long b = a;
        float c = 10.5f;
        double d = c;

        System.out.println("Implicit Casting:");
        System.out.println("int -> long: " + b);
        System.out.println("float -> double: " + d);

        // Explicit Casting
        double pi = 3.14159;
        int piInt = (int) pi;

        long bigNum = 123456789L;
        int smallNum = (int) bigNum;

        double bigDecimal = 12345.6789;
        float floatDecimal = (float) bigDecimal;

        System.out.println("\nExplicit Casting:");
        System.out.println("double -> int: " + piInt);
        System.out.println("long -> int: " + smallNum);
        System.out.println("double -> float: " + floatDecimal);

        // Overflow example
        byte maxByte = 127;
        byte overflow = (byte)(maxByte + 1);

        System.out.println("\nOverflow Example:");
        System.out.println("byte 127 + 1 = " + overflow + " (overflow)");
    }
}