package ch7;
import java.util.Scanner;

public class ch7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 행의 개수
        int M = scanner.nextInt();  // 열의 개수
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 행렬 A와 B의 합 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();  // 각 행의 출력이 끝나면 줄 바꿈
        }
    }
}
