package practice;

public class asd {
    public static void main(String[] args) {
        String input = "//;\n1;2;3";
        String Seperator = " "; //구분자 문자열 생성

        // 커스텀 구분자가 있는지 확인
        if (input.startsWith("//")) {
            int index = input.indexOf("\n");
            // "//"와 "\n" 사이의 구분자 추출
            Seperator = input.substring(2, index);
        }

        System.out.println(Seperator);
    }
}
