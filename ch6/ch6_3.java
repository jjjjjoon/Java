package ch6;
import java.util.Scanner;

public class ch6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = a-1; i >= 0; i--) {
            System.out.printf(" ");
            for(int j = 0; j<a; j++) {
                System.out.printf("*");
            }
        }
    }
}
