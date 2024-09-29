package ch3;
import java.util.Scanner;

public class ch3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = 0;
        int d = 0;
        int sum = 0;

        for(int i = 0;i < b; i++) {
            c = scanner.nextInt();
            d = scanner.nextInt();
            sum += (c*d);
        }
        if(sum == a)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
