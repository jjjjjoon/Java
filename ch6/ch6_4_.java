package ch6;
import java.util.Scanner;

public class ch6_4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("1");
        }
        else System.out.println("0");
    }
}
