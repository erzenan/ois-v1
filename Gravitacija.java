import java.util.*;
public class Gravitacija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OIS je zakon!");
        double v = sc.nextDouble();
        izpis(v);
        
    }

    public static double g(double v) {
        final double C = 6.674 * Math.pow(10, -11);
        final double M = 5.972 * Math.pow(10, 24);
        final double r = 6.371 * Math.pow(10, 6);
        return C * M / Math.pow((r + v), 2);
    }

    public static void izpis(double v) {
        System.out.println(v + " " + g(v));
    }
}