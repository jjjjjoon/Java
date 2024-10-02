package class1;
import java.util.Scanner;

public class no2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[8];
        for(int i = 0; i < 8; i++) {
            A[i] = scanner.nextInt();
        }

        String result = "";

        boolean isAscending = true;
        for (int i = 0; i < 7; i++) {
            if (A[i] > A[i + 1]) {
                isAscending = false;
                break;
            }
        }

        boolean isDescending = true;
        for(int i = 0; i < 7; i++) {
            if(A[i] < A[i + 1]) {
                isDescending = false;
                break;
            }
        }

        if (isAscending) {
            result = "ascending";
        } else if (isDescending) {
            result = "descending";
        } else {
            result = "mixed";
        }

        System.out.println(result);

    }
}
