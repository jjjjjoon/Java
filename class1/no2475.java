package class1;
import java.util.Scanner;

public class no2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = (a*a + b*b + c*c + d*d + e*e) % 10;
        System.out.println(f);
    }
}
