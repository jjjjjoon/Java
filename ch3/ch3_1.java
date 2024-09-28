package ch3;
import java.util.Scanner;

public class ch3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i < 10; i++)
            System.out.printf("%d * %d = %d\n", a, i, a * i);
    }
}
