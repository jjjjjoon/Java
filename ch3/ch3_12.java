package ch3;
import java.util.Scanner;

public class ch3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b + c);
        }
    }
}
