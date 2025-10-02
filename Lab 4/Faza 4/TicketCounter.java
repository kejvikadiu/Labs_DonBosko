public class TicketCounter {
    public static void main(String[] args) {
        int biletaFillestare = 100;
        int shitje1 = 35;
        int shitje2 = 28;
        boolean bonusDitor = true;
        int cmimi = 40;

        biletaFillestare -= shitje1;
        System.out.println("Shitje paradite: " + shitje1 + " → stok: " + biletaFillestare);

        biletaFillestare -= shitje2;
        System.out.println("Shitje pasdite: " + shitje2 + " → stok: " + biletaFillestare);

        int totalBiletaShitura = shitje1 + shitje2;
        double teArdhura = totalBiletaShitura * cmimi;

        if (bonusDitor) {
            teArdhura += teArdhura * 0.05;
            System.out.println("Bonus 5% i aplikuar: " + teArdhura * 0.05);
        }

        System.out.println("Të ardhurat bruto: " + teArdhura);

        int lek = (int) Math.round(teArdhura);
        System.out.println("Raporto (lek, i rrumbullakuar): " + lek);
    }
}