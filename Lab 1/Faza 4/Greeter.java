import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj emrin: ");
        String emri = sc.nextLine();

        System.out.print("Shkruaj qytetin: ");
        String qyteti = sc.nextLine();

        System.out.println("Përshëndetje, " + emri + " nga " + qyteti + "!");

        sc.close();
    }
}