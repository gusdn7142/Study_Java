import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //두 수를 입력
        System.out.println("두 수를 입력하세요.");
        String[] inputStr = scan.nextLine().split(" ");
        //두 수의 합을 출력
        int sum = Integer.parseInt(inputStr[0]) + Integer.parseInt(inputStr[1]);
        System.out.println("두 수의 합은 " + sum + "입니다.");
    }
}
