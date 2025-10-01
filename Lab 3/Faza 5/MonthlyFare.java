import java.util.Scanner;

public class MonthlyFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ditet e punes: ");
        int ditePune = sc.nextInt();

        System.out.print("Çmimi ditor: ");
        double cmimDitor = sc.nextDouble();

        System.out.print("A je nxenes? (true/false): ");
        boolean eshteNxenes = sc.nextBoolean();

        System.out.print("Distanca (km): ");
        int distanceKm = sc.nextInt();

        double tarifa = ditePune * cmimDitor;
        System.out.println("Tarifa baze: " + tarifa);

        if (eshteNxenes) {
            tarifa *= 0.9;
            System.out.println("Pas zbritjes nxenes: " + tarifa);
        } else {
            System.out.println("Pas zbritjes nxenes (nuk aplikohet): " + tarifa);
        }

        if (distanceKm > 10) {
            tarifa *= 1.05;
            System.out.println("Pas shteses distance (" + distanceKm + " km): " + tarifa);
        }

        if (ditePune >= 22 && !eshteNxenes) {
            tarifa -= 200;
            if (tarifa < 0) tarifa = 0;
            System.out.println("Pas kuponit besnikeri: " + tarifa);
        }

        int totalLek = (int) Math.round(tarifa);
        System.out.println("Totali (lek): " + totalLek);
    }
}