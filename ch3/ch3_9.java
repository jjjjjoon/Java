package ch3;
import java.util.Scanner;

public class ch3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        for(int i = 1;i<=a;i++)
        {
            for(int j = 1;j<=i;j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
