package ch5;
import java.util.Scanner;

public class ch5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            String a = scanner.next();

            System.out.printf("%c%c\n", a.charAt(0), a.charAt(a.length() - 1));
        }
    }
}
