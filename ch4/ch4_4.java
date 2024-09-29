package ch4;
import java.util.Scanner;

public class ch4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        for(int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        int a = 0;
        for(int i = 0; i < 9; i++) {
            if(array[i] > max) {
                max = array[i];
                a = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(a);
    }
}
