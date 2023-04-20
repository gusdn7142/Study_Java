package EnumExam;

public class DaySwitchTest {
    public static void main(String[] args) {

        Day day = Day.SUNDAY;   //SUNDAY 상수 선언

        switch(day){
            case SUNDAY:
                System.out.println("일요일입니다.");
                break;
            case MONDAY:
                System.out.println("월요일입니다.");
                break;
            default:
                System.out.println("그 밖의 요일");
        }

    }
}



