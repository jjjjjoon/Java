package ch3;
import java.util.Scanner;

public class ch3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(b == 0 && c == 0) break;

            System.out.println(b + c);

        }
    }
}
