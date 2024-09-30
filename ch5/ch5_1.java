package ch5;
import java.util.Scanner;

public class ch5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = scanner.nextInt();
        System.out.println(a.charAt(b-1));
    }
}
