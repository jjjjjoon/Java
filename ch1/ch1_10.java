package ch1;
import java.util.Scanner;

public class ch1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((b%10) * a);
        System.out.println((b/10%10) * a);
        System.out.println((b/100) * a);
        System.out.println(b * a);
    }
}
