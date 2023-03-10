
import java.util.Scanner;


public class Prompt {

    public void runPrompt() {
        /*
         * 1. (프로그램 종료 전까지) 반복해서 월을 숫자로 입력받아 가상의 달력 출력
         */
        Scanner scan = new Scanner(System.in);
        int inputYear = -1;
        int inputMonth = -1;
        boolean checkInputYear = false;
        boolean checkInputMonth = false;

        while(true) {
            Calendar calendar = new Calendar();

            if(!checkInputYear) {
                System.out.println("년도를 입력하세요.");
                System.out.print("Year>");
                inputYear = scan.nextInt();   //ex, 2100
                if(calendar.isEndProgram(inputYear)) break;   //프로그램 종료 여부 확인
                checkInputYear = true;
            }
            checkInputYear = calendar.isRangeYear(inputYear);   //연도의 범위가 2000~2050인지 체크
            if(!checkInputYear) continue;

            if(!checkInputMonth) {
                System.out.println("월을 입력하세요.");
                System.out.print("Month>");
                inputMonth = scan.nextInt();   //ex, 2
                if(calendar.isEndProgram(inputMonth)) break;   //프로그램 종료 여부 확인
                checkInputMonth = true;
            }

            checkInputMonth = calendar.isRangeMonth(inputMonth);   //월의 범위가 1~12인지 체크
            if(!checkInputMonth) continue;;


            calendar.printCalendar(inputYear, inputMonth);
            checkInputYear = false;
            checkInputMonth = false;
            //System.out.printf("%d월은 %d일까지 있습니다 \n\n", inputMonth, calendar.getMaxDayOfMonth(inputMonth));
        }
        scan.close();
    }

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }

}








