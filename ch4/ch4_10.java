package ch4;
import java.util.Scanner;

public class ch4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] A = new double[N];
        double max = 0;
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(max < A[i]) {
                max = A[i];
            }
        }
        double[] B = new double[N];
        double sum = 0;
        for(int i = 0; i < N; i++) {
            B[i] = (A[i] / max * 100);
        }
        for(int i = 0; i < N; i++) {
            sum += B[i];
        }
        System.out.printf("%f", sum/N);

    }
}
