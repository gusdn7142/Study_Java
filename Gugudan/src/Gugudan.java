import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        //조건문을 활용한 구구단 구현
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println("사용자가 입력한 값 : " + number);

        if(number < 2 || number > 9){  //예외 처리
            System.out.println("입력 값은 2와 9사이의 값이여야 합니다.");
        }
        else{
            //number에 대한 구구단 출력
            for(int i=1; i<=9; i++){
                System.out.println(number * i);
            }
        }
    }
}