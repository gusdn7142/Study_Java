
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
        switch (weekday){
            case "SU":
                return 0;
            case "MO":
                return 1;
            case "TU":
                return 2;
            case "WE":
                return 3;
            case "TH":
                return 4;
            case "FR":
                return 5;
            case "SA":
                return 6;
            default:
                return 0;
        }
    }

    private void cmdRegister(Scanner scan, Calendar calendar) {  //일정 등록

        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요. (yyyy-MM-dd)");
        String strDate = scan.next();
        scan.nextLine();                     //개행문자(엔터)를 제거하기위해 추가

        //String text="";
        System.out.println("일정을 입력해 주세요. ");
        //while(true){
        //    String word = scan.next();
        //    text += word + " ";
        //    if(word.endsWith(";")) break;;
        //}
        String text = scan.nextLine();
        calendar.registerPlan(strDate, text);
    }

    private void cmdSearch(Scanner scan, Calendar calendar) {  //일정 검색
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해 주세요. (yyyy-MM-dd)");
        String strDate = scan.next();

        PlanItem planItem = calendar.searchPlan(strDate);
        if(planItem != null){
            System.out.println(planItem.planContent);
        } else {
            System.out.println("일정이 없습니다.");
        }
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

        boolean isLoop = true;
        while(isLoop) {
            System.out.println("명령을 입력해 주세요. (예시 : 1.일정등록, 2.일정검색, 3.일정보기, h.도움말, q.종료)");
            String cmd = scan.next();
            switch (cmd){
                case "1":
                    cmdRegister(scan, calendar);  //일정 등록
                    break;
                case "2":
                    cmdSearch(scan, calendar);    //일정 검색
                    break;
                case "3":
                    cmdCal(scan, calendar);       //일정 보기
                    break;
                case "h":
                    printMenu();                  //도움말
                    break;
                case "q":
                    isLoop = false;               //종료
                    break;
            }
        }
        System.out.println("Thank you. Bye~");
        scan.close();
    }



    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }

}








