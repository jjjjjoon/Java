package ch6;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class ch6_8_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        for(int i = 0; i < 20; i++) {
            String A = scanner.next();
            double B = scanner.nextDouble();
            String C = scanner.next();

            if(!C.equals("P")) {
                a += B*map.get(C);
                b += B;
            }
        }
        System.out.printf("%.6f", a/b);

    }
}
