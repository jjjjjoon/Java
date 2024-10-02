package class1;
import java.util.Scanner;

public class no8958_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();  // 테스트 케이스 개수 입력
        scanner.nextLine();  // 개행 문자 처리

        for (int i = 0; i < testCases; i++) {
            String input = scanner.nextLine();  // OX 퀴즈 결과 입력
            int score = 0;  // 총 점수
            int consecutive = 0;  // 연속된 O의 점수

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    consecutive++;  // O일 때 연속된 개수 증가
                    score += consecutive;  // 연속된 O의 점수 더함
                } else {
                    consecutive = 0;  // X일 때 연속된 점수를 초기화
                }
            }

            System.out.println(score);  // 각 테스트 케이스의 총 점수 출력
        }
    }
}
