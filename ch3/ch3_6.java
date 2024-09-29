package ch3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ch3_6 {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 수 입력
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 한 줄에 두 숫자가 주어지므로, split으로 분리
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            // 두 수의 합을 BufferedWriter에 저장
            bw.write((A + B) + "\n");
        }

        // 출력 후 반드시 flush와 close
        bw.flush();
        bw.close();
        br.close();
    }
}