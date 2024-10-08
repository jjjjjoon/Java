package ch7;
import java.util.Scanner;

public class ch7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] array = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                array[i][j] = line.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (array[i][j] != '\0') {
                    System.out.print(array[i][j]);
                }
            }
        }
    }
}
