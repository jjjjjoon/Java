package ch7;
import java.util.Scanner;

public class ch7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[100][100];
        int n = sc.nextInt();
        int coveredArea = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (paper[j][k] == 0) {
                        paper[j][k] = 1;
                        coveredArea++;
                    }
                }
            }
        }

        System.out.println(coveredArea);
    }
}
