package ch2;
import java.util.Scanner;

public class ch2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a<0 && b<0)
            System.out.println("3");
        else if(a<0 && b>0)
            System.out.println("2");
        else if(a>0 && b<0)
            System.out.println("4");
        else System.out.println("1");
    }
}
