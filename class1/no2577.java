package class1;
import java.util.Scanner;

public class no2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = a * b * c;
        String D = Integer.toString(d);

        for(int i = 0; i<10; i++) {
            int count = 0;
            for (int j = 0; j<D.length(); j++) {
                if (D.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
