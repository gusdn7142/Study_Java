import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 28, 31};

    public int getMaxDayOfMonth(int month){
        return MAX_DAYS[month - 1];
    }

    public void printSampleCalendar(){
        System.out.println("샘플 달력입니다.");
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {

        /*
         * 1. 숫자를 입력받아 해당하는 월의 최대 일수를 구하기
         */
        Scanner scan = new Scanner(System.in);
        //두 수를 입력
        System.out.println("달을 입력하세요.");
        int inputMonth = scan.nextInt();   //ex, 3

        if (inputMonth < 1 || inputMonth > 12) {
            System.out.println("1에서 12사이의 값을 입력하세요");
        }

        Calendar calendar = new Calendar();
        System.out.printf("%d월은 %d일까지 있습니다 \n\n", inputMonth, calendar.getMaxDayOfMonth(inputMonth));
        calendar.printSampleCalendar();
    }
}
