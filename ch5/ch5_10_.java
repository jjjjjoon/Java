package ch5;
import java.util.Scanner;
import java.util.HashMap;

public class ch5_10_ {
    public static void main(String[] args) {
        HashMap<Character, Integer> dialMap = new HashMap<>();
        dialMap.put('A', 2);
        dialMap.put('B', 2);
        dialMap.put('C', 2);
        dialMap.put('D', 3);
        dialMap.put('E', 3);
        dialMap.put('F', 3);
        dialMap.put('G', 4);
        dialMap.put('H', 4);
        dialMap.put('I', 4);
        dialMap.put('J', 5);
        dialMap.put('K', 5);
        dialMap.put('L', 5);
        dialMap.put('M', 6);
        dialMap.put('N', 6);
        dialMap.put('O', 6);
        dialMap.put('P', 7);
        dialMap.put('Q', 7);
        dialMap.put('R', 7);
        dialMap.put('S', 7);
        dialMap.put('T', 8);
        dialMap.put('U', 8);
        dialMap.put('V', 8);
        dialMap.put('W', 9);
        dialMap.put('X', 9);
        dialMap.put('Y', 9);
        dialMap.put('Z', 9);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int totalTime = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int dialNum = dialMap.get(ch);
            totalTime += dialNum + 1;
        }

        System.out.println(totalTime);
    }
}
