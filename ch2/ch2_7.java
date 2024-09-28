package ch2;
import java.util.Scanner;

public class ch2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max1 = Math.max(a, b);
        int max = Math.max(max1, c);

        if(a==b && b==c)
            System.out.println(10000+a*1000);
        else if(a==b && a!=c)
            System.out.println(1000+a*100);
        else if(a==c && a!=b)
            System.out.println(1000+a*100);
        else if(a!=b && b==c)
            System.out.println(1000+b*100);
        else System.out.println(max*100);
    }
}
