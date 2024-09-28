package ch2;
import java.util.Scanner;

public class ch2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(b+c<60)
            System.out.printf("%d %d",a, b+c);
        else if(b+c>=60 && (b+c)/60+a < 24)
            System.out.printf("%d %d", (b+c)/60 +a, (b+c)%60);
        else System.out.printf("%d %d", ((b+c)/60 +a) %24, (b+c)%60);
    }
}
