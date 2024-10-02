package ch6;
import java.util.Scanner;

public class ch6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String A = a.toUpperCase();
        int[] b = new int[26];

        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            b[c - 'A']++;
        }

        int maxCount = -1;  // 가장 많이 등장한 알파벳의 등장 횟수
        char result = '?';  // 결과로 출력할 알파벳 (초기값은 ?로 설정)

        // 가장 많이 등장한 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (b[i] > maxCount) {
                maxCount = b[i];
                result = (char) (i + 'A');  // 해당 인덱스의 알파벳으로 변환
            } else if (b[i] == maxCount) {
                result = '?';  // 최댓값이 여러 개일 경우 ?로 설정
            }
        }

        System.out.println(result);
    }
}
