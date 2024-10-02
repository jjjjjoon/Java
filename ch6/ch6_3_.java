package ch6;
import java.util.Scanner;

public class ch6_3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 입력받은 숫자 n

        // 상단 부분 (중간 줄 포함)
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }

        // 하단 부분
        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
    }
}
