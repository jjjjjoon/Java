package ch4;
import java.util.Scanner;

public class ch4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        for (int i = 0; i < 28; i++) {
            int a = scanner.nextInt();
            for(int j = 0; j < 30; j++) {
                if(a==array[j]) {
                    array[j] = 0;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                System.out.printf("%d ", i+1);
            }
        }
    }
}
