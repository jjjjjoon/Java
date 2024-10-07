package ch7;
import java.util.Scanner;

public class ch7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        // 입력받으면서 최대값을 찾고 그 위치를 기록
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i + 1;  // 1-based index
                    col = j + 1;  // 1-based index
                }
            }
        }

        // 최대값과 위치 출력
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
