
import java.util.Scanner;


public class Prompt {

    private final static String PROMPT ="cal>";

    public void runPrompt() {
        /*
         * 1. (프로그램 종료 전까지) 반복해서 월을 숫자로 입력받아 가상의 달력 출력
         */
        Scanner scan = new Scanner(System.in);
        String Prompt = "cal> ";

        while(true) {
            System.out.println("월을 입력하세요.");
            System.out.print(Prompt);
            int inputMonth = scan.nextInt();   //ex, 3

            if (inputMonth < 1 || inputMonth > 12) {
                if(inputMonth == -1){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                System.out.println("1에서 12사이의 값을 입력하세요");
                continue;
            }

            Calendar calendar = new Calendar();
            calendar.printCalendar(2023, inputMonth);
            //System.out.printf("%d월은 %d일까지 있습니다 \n\n", inputMonth, calendar.getMaxDayOfMonth(inputMonth));
        }
        scan.close();
    }

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        prompt.runPrompt();
    }

}








