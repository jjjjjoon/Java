package ch2;

import java.util.Scanner;
import java.time.LocalTime;

public class ch2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        LocalTime time = LocalTime.of(a, b);
        LocalTime time1 = time.minusMinutes(45);
        System.out.println(time1.getHour() + " " + time1.getMinute());
    }
}
