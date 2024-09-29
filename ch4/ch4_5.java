package ch4;
import java.util.Scanner;

public class ch4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for(int j = a; j <= b; j++) {
                array[j - 1] = c;
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
