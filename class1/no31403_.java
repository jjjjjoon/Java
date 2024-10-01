package class1;
import java.util.Scanner;

public class no31403_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String A = Integer.toString(a);
        String B = Integer.toString(b);

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(A + B) - c);

    }
}
