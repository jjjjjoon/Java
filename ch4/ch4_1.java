package ch4;
import java.util.Scanner;

public class ch4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] A = new int[size];
        int i = 0;

        while(i < size) {
            A[i] = scanner.nextInt();
            i++;
        }

        int b = scanner.nextInt();
        int count=0;

        for(int j=0;j<size;j++) {
            if(A [j] == b) count++;
        }

        System.out.println(count);

    }
}
