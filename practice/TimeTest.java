package practice;

public class TimeTest {
    public static void main(String[] args) {

        Time t = new Time(12, 35, 30);
        System.out.println(t);          // 12:35:30

        // t.hour = 13;                 // <-- 에러! hour 의 접근 제어자가 private 이므로 접근할 수 없음.

        t.setHour(t.getHour() + 1);     // 현재 시간보다 1시간 후로 변경.
        System.out.println(t);          // 13:35:30
    }
}

//변수를 private으로 설정해서 직접 접근 불가, public 메서드를 통해 간접 접근 가능
class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // hour 에 관한 getter 와 setter
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return ;
        }
        this.hour = hour;
    }

    // minute 에 관한 getter 와 setter
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return ;
        }
        this.minute = minute;
    }

    // second 에 관한 getter 와 setter
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            return ;
        }
        this.second = second;
    }


    // Object 클래스의  toString 을 오버라이딩
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}