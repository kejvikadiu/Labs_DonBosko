import java.util.Scanner;

public class DoubleCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj tarifa teorike: ");
        double tarifaTeorike = sc.nextDouble();

        System.out.print("Shkruaj tarifa e llogaritur: ");
        double tarifaLlogaritur = sc.nextDouble();

        final double EPS = 0.0001;

        boolean baraziSakte = tarifaTeorike == tarifaLlogaritur;
        boolean baraziAfer = Math.abs(tarifaTeorike - tarifaLlogaritur) < EPS;

        System.out.println("Barazi e saktë (==): " + baraziSakte);
        System.out.println("Barazi e përafërt (epsilon): " + baraziAfer);
    }
}