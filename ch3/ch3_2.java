package ch3;
import java.util.Scanner;

public class ch3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 0;i<a; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b + c);
        }
    }
}
