package ch4;
import java.util.Scanner;
import java.util.HashSet;

public class ch4_8_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        HashSet<Integer> uniqueValues = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            A[i] = a;
            B[i] = a % 42;
        }

        for (int value : B) {
            uniqueValues.add(value);
        }
        System.out.println(uniqueValues.size());
    }
}
