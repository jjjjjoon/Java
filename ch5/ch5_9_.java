package ch5;
import java.util.Scanner;

public class ch5_9_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int reversedA = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(b).reverse().toString());

        if (reversedA > reversedB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }
    }
}
