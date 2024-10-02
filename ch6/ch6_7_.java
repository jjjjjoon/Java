package ch6;
import java.util.Scanner;

public class ch6_7_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {
            String a = scanner.next();
            if(isGroupWord(a)) count++;
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];  // 알파벳 방문 여부를 체크할 배열
        char prevChar = ' ';  // 이전 문자를 저장할 변수

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // 이전 문자와 현재 문자가 다르고, 현재 문자가 이미 등장한 경우 그룹 단어가 아님
            if (prevChar != currentChar) {
                if (visited[currentChar - 'a']) {
                    return false;
                }
                // 현재 문자가 처음 등장한 경우 방문 체크
                visited[currentChar - 'a'] = true;
            }
            // 이전 문자를 현재 문자로 갱신
            prevChar = currentChar;
        }
        return true;  // 모든 문자가 조건을 만족하면 그룹 단어임

    }
}
