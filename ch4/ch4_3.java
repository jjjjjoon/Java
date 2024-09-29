package ch4;
import java.util.Scanner;

public class ch4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for(int i = 0; i < size; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        System.out.print(min + " ");

        int max = array[0];
        for(int i = 0; i < size; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max);
    }
}
