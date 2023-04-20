package EnumExam;

public class EnumEqualTest {

    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.MONDAY;

        if(day1==day2){
            System.out.println("같은 요일입니다.");
        }
    }
}
