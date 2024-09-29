package ch4;
import java.util.Scanner;

public class ch4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = i+1;
        }
        for(int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while(a<b) {
                int temp = array[a-1];
                array[a-1] = array[b-1];
                array[b-1] = temp;
                a++;
                b--;
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
