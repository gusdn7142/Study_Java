
public class Calendar {

    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean isLeapYear(int year){  //윤년인지 체크
        if(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }

//    public boolean isEndProgram(int num){  //프로그램 종료 여부 확인
//        if(num == -1){
//            System.out.println("프로그램을 종료합니다.");
//            return true;
//        }
//        return false;
//    }

    public boolean isRangeYear(int year){    //연도의 범위에 대한 유효성 검사
        if (year < 1970 || year > 2050) {
            System.out.println("오류 발생 : 1970에서 2050사이의 값을 입력하세요");
            return false;
        }
        return true;
    }

    public boolean isRangeMonth(int month){    //월의 범위에 대한 유효성 검사
        if (month < 1 || month > 12) {
            System.out.println("오류 발생 : 1에서 12사이의 값을 입력하세요");
            return false;
        }
        return true;
    }

    public int getMaxDayOfMonth(int year, int month){
        if(isLeapYear(year))  //윤년이면
            return LEAP_MAX_DAYS[month];
        else
            return MAX_DAYS[month];
    }

    private int getWeekDay(int year, int month, int day) {   //연도, 월, 일에 따른 요일 조회
        int syear = 1970;                //기준 연도
        int smonth = 1;                  //기준 월
        //int sday = 1;
        final int STANDARDWEEKDAY = 4;   //기준 요일,  1970/Jan/1st = Thurthday

        int count = 0;   //전체 날짜 카운트

        //연도에 따른 일 계산
        for(int i=syear; i<year; i++){
            int delta = isLeapYear(i) ? 366 : 365;   //윤년이면 366
            count += delta;
        }

        //월에 따른 일 계산
        for(int i=smonth; i<month; i++){
            int delta = getMaxDayOfMonth(year, i);
            count += delta;
        }

        //일 추가 계산
        count += day - 1;

        //계산한 일에 기준 (요)일을 더한 값을 7로 나눠 요일 계산
        int weekDay = (count + STANDARDWEEKDAY) % 7;
        return weekDay;
    }

    public void printCalendar(int year, int month){
        System.out.printf("   <<%4d년%3d월>>\n",year, month);
        System.out.println("  SU MO TU WE TH FR SA");
        System.out.println("  -------------------");

        int weekDay = getWeekDay(year, month, 1);   //매달의 첫번째 요일 반환 (요일 범위 : 0~6)

        for(int i=0; i<weekDay; i++){   //first Line
            System.out.print("   ");
        }

        int maxDay = getMaxDayOfMonth(year, month);
        int count = 7-weekDay;
        int newLine = count < 7 ? count : 0;

        for (int i=1; i<=count; i++){   //first Line
            System.out.printf("%3d", i);
        }
        System.out.println();

        for(int i=count+1; i<=maxDay; i++){   //Seconde Line ~ Last Line
            System.out.printf("%3d", i);
            if(i % 7==newLine) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();
        System.out.println(cal.getWeekDay(1970, 1, 1));
//        System.out.println(cal.getWeekDay(1971, 1, 1)==4);
//        System.out.println(cal.getWeekDay(1972, 1, 1)==5);


    }

}








