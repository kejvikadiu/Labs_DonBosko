public class FixTheBugs {
    public static void main(String[] args) {
        int v = 10;
        
        System.out.println(v++ + ++v); // Shpjegim: 10 + 12 = 22

        v += 2 * 1; ;

        v--;

        double d = 5;
        d /= 2;

        System.out.println("v=" + v + ", d=" + d);
    }
}
