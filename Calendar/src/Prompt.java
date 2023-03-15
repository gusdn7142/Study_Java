
import java.sql.SQLOutput;
import java.util.Scanner;


public class Prompt {

    public void printMenu(){

        System.out.println("+--------------------------+");
        System.out.println("| 1. 일정 등록        ");
        System.out.println("| 2. 일정 검색        ");
        System.out.println("| 3. 일정 보기        ");
        System.out.println("| h. 도움말  q. 종료   ");
        System.out.println("+--------------------------+");
    }


    public int parseDay(String weekday){
        if(weekday.equals("SU")) return 0;
        else if (weekday.equals("MO")) return 1;
        else if (weekday.equals("TU")) return 2;
        else if (weekday.equals("WE")) return 3;
        else if (weekday.equals("TH")) return 4;
        else if (weekday.equals("FR")) return 5;
        else if (weekday.equals("SA")) return 6;
        else return 0;
    }

    private void cmdRegister() {
    }

    private void cmdSearch() {
    }

    private void cmdCal(Scanner scan, Calendar calendar) {
        int inputYear = -1;
        int inputMonth = -1;
        int weekday = 0;
        boolean checkInputYear = false;
        boolean checkInputMonth = false;

        if(!checkInputYear) {
            System.out.println("년도를 입력하세요.");
            System.out.print("Year>");
            inputYear = scan.nextInt();   //ex, 2100
            //if(calendar.isEndProgram(inputYear)) break;   //프로그램 종료 여부 확인
            checkInputYear = true;
        }
        checkInputYear = calendar.isRangeYear(inputYear);   //연도의 범위가 2000~2050인지 체크
        if(!checkInputYear) return;   //continue;

        if(!checkInputMonth) {
            System.out.println("월을 입력하세요.");
            System.out.print("Month>");
            inputMonth = scan.nextInt();   //ex, 2
            //if(calendar.isEndProgram(inputMonth)) break;   //프로그램 종료 여부 확인
            checkInputMonth = true;
        }

        checkInputMonth = calendar.isRangeMonth(inputMonth);   //월의 범위가 1~12인지 체크
        if(!checkInputMonth) return;   //continue;

        calendar.printCalendar(inputYear, inputMonth);
        checkInputYear = false;
        checkInputMonth = false;
        //System.out.printf("%d월은 %d일까지 있습니다 \n\n", inputMonth, calendar.getMaxDayOfMonth(inputMonth));
    }



    public void runPrompt() {
        /*
         * 1. (프로그램 종료 전까지) 반복해서 년도와 월을 숫자로 입력받아 가상의 달력 출력
         */
        printMenu();
        Scanner scan = new Scanner(System.in);
        Calendar calendar = new Calendar();

        while(true) {
            System.out.println("명령을 입력해 주세요. (예시 : 1.일정등록, 2.일정검색, 3.일정보기, h.도움말, q.종료)");
            String cmd = scan.next();
            if(cmd.equals("1")) cmdRegister();                 //일정 등록
            else if (cmd.equals("2")) cmdSearch();             //일정 검색
            else if (cmd.equals("3")) cmdCal(scan, calendar);  //일정 보기
            else if (cmd.equals("h")) printMenu();             //도움말
            else if (cmd.equals("q")) break;                   //종료
        }
        System.out.println("Thank you. Bye~");
        scan.close();
    }



    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }

}








