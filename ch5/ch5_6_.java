package ch5;
import java.util.Scanner;

public class ch5_6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        int[] a = new int[26];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i) - 'a';
            if (a[c] == -1) {
                a[c] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
