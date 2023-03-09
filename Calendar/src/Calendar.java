public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 28, 31};

    public int getMaxDayOfMonth(int month){
        return MAX_DAYS[month - 1];
    }

    public void printCalendar(int inputYear, int inputMonth){
        System.out.printf("   <<%4d년%3d월>>\n",inputYear, inputMonth);
        System.out.println("  일 월 화 수 목 금 토");
        System.out.println("  -------------------");

        int maxDay = getMaxDayOfMonth(inputMonth);
        for(int i=1; i<=maxDay; i++){
            System.out.printf("%3d", i);
            if(i % 7==0) System.out.println();
        }
        System.out.println();
    }
}








