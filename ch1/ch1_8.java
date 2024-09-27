package ch1;
import java.util.Scanner;

public class ch1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(1000<= a && a <= 3000)
        {
            System.out.println(a-543);
        }
        else System.out.println("error!");
    }
}
