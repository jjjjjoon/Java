package practice;

public class Yaho {
    public static void main(String[] args) {
        MyTest test1 = new MyTest(100);
        MyTest test2 = new MyTest(10);
        MyTest test3 = new MyTest(test1);


        System.out.println(test1.getA());
        System.out.println(test2.getA());

        test1.setA(10);
        System.out.println(test2.getB());
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}

// MyTest 클래스 정의
class MyTest {
    int a;
    static int b;

     //생성자
    public MyTest(int a) {
        this(10, 10);
    }

    public MyTest(int a, int b){
        this.a = a;
        this.b = b;
    }

    public MyTest(MyTest t) {
        this.a = t.a;
        this.b = t.b;
    }

    // getter 메서드
    public int getA() {
        System.out.println(this);
        return a;
    }


    public static int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void setB(int b) {
        MyTest.b = b;
    }
}
