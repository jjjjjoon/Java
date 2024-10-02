package ch6;
import java.util.Scanner;

public class ch6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        a = a.replace("c=", "1");
        a = a.replace("c-", "2");
        a = a.replace("dz=", "3");
        a = a.replace("d-", "4");
        a = a.replace("lj", "5");
        a = a.replace("nj", "6");
        a = a.replace("s=", "7");
        a = a.replace("z=", "8");

        System.out.println(a.length());

    }
}
