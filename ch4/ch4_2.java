package ch4;
import java.util.Scanner;

public class ch4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int a = scanner.nextInt();
        int[] A = new int[size];
        int i = 0;

        while(i < size) {
            A[i] = scanner.nextInt();
            i++;
        }
        for(int j = 0;j<size;j++)
        {
            if(A[j] < a) {
                System.out.printf("%d ", A[j]);
            }
        }

    }
}
