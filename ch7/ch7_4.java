package ch7;
import java.util.Scanner;

public class ch7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[100][100];  // 100x100 도화지
        int n = sc.nextInt();  // 색종이의 수
        int coveredArea = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();  // 색종이의 왼쪽 아래 x 좌표
            int y = sc.nextInt();  // 색종이의 왼쪽 아래 y 좌표

            // 10x10 크기의 색종이를 도화지에 붙인다.
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (paper[j][k] == 0) {  // 아직 덮이지 않은 영역이라면
                        paper[j][k] = 1;
                        coveredArea++;  // 덮인 영역 카운트
                    }
                }
            }
        }

        System.out.println(coveredArea);  // 덮인 면적 출력
    }
}
