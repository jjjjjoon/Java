package ch3;
import java.util.Scanner;

public class ch3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 0;

        for(int i=0;i<=a;i++) {
            b += i;
        }
        System.out.printf("%d", b);
    }
}
