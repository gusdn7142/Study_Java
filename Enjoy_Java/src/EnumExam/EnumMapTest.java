package EnumExam;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {

        EnumMap emap = new EnumMap(Day.class);   //enum 타입을 key로 사용하는 EnumMap 객체 생성
        emap.put(Day.SUNDAY, "일요일");
        emap.put(Day.FRIDAY, "금요일");
        emap.put(Day.MONDAY, "월요일");

        System.out.println(emap.get(Day.SUNDAY)); //EnumMap에서 key가 SUNDAY인 value 조회
    }
}
