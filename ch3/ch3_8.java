package ch3;
import java.util.Scanner;

public class ch3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i = 1; i<=a; i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.printf("case #%d: %d + %d = %d\n", i, b, c, b+c);
        }
    }
}
