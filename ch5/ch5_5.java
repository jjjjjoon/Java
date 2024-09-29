package ch5;
import java.util.Scanner;

public class ch5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        String c ="1";
        String a = scanner.next();
        for(int i = 0; i < N; i++) {
            int b = a.charAt(i) - c.charAt(0) + 1;
            sum += b;
        }
        System.out.println(sum);
    }
}
