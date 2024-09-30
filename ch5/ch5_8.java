package ch5;
import java.util.Scanner;

public class ch5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int count = 1;
        int length = a.length();

        for(int i = 0; i < a.length(); i++) {
            if(i == 0) {
                continue;
            }

            else if(a.charAt(i) == ' ') {
                count++;
            }
        }
        if(a.charAt(length - 1) == ' ') {
            count--;
        }
        System.out.println(count);
    }
}
