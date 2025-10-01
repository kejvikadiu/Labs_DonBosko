import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareLogicDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Shkruaj moshen: ");
            int mosha = sc.nextInt();

            System.out.print("A je nxënës? (true/false): ");
            boolean eshteNxenes = sc.nextBoolean();

            // Shprehjet direkt në println
            System.out.println("Zbritja lejohet: " + ((mosha < 18) || eshteNxenes));
            System.out.println("Zbritje shtesë 2 lek: " + ((mosha < 12) && eshteNxenes));

        } catch (InputMismatchException e) {
            System.out.println("Gabim në input! Sigurohu që mosha është numër dhe nxënësi është true/false.");
        } finally {
            sc.close(); // gjithmonë mbyll Scanner-in
        }
    }
}
