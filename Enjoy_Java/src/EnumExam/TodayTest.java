package EnumExam;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.SUNDAY);   //today 객체의 day 필드에  Day.SUNDAY 상수값 입력

        System.out.println(today.getDay());  //today 객체의 day 필드값 출력
    }
}
