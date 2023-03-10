
public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean isLeapYear(int year){  //윤년인지 체크
        if(year % 4 ==0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }

    public boolean isEndProgram(int num){  //프로그램 종료 여부 확인
        if(num == -1){
            System.out.println("프로그램을 종료합니다.");
            return true;
        }
        return false;
    }

    public boolean isRangeYear(int year){    //연도의 범위에 대한 유효성 검사
        if (year < 2000 || year > 2050) {
            System.out.println("오류 발생 : 2000에서 2050사이의 값을 입력하세요");
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
            return LEAP_MAX_DAYS[month-1];
        else
            return MAX_DAYS[month-1];
    }

    public void printCalendar(int inputYear, int inputMonth){
        System.out.printf("   <<%4d년%3d월>>\n",inputYear, inputMonth);
        System.out.println("  일 월 화 수 목 금 토");
        System.out.println("  -------------------");

        int maxDay = getMaxDayOfMonth(inputYear, inputMonth);
        for(int i=1; i<=maxDay; i++){
            System.out.printf("%3d", i);
            if(i % 7==0) System.out.println();
        }
        System.out.println();
    }
}








