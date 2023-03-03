import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 숫자단 클래스
 */
public class UserGugudan {

    //숫자단 계산 기능
    static List<Integer> calculate(int first, int last) {
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=last; i++) {   //구구단 계삽 값을 리스트에 저장
            result.add(first * i);
        }
        return result;
    }

    //숫자단 출력 기능
    static void print(List<Integer> result){
        for (Integer resultElement : result) {
            System.out.print(resultElement + " ");
        }
        System.out.println();
    }
}

/*
 * 숫자단 테스트 클래스
 */
class TestUserGugudan {
    public static void main(String[] args) {

        //숫자 단 입력
        Scanner scan = new Scanner(System.in);
        String strGugudan = scan.nextLine();         //"8,7"
        String[] strGugudans = strGugudan.split(",");

        //숫자 단 계산
        int first = Integer.parseInt(strGugudans[0]);
        int last = Integer.parseInt(strGugudans[1]);

        List<Integer> result = UserGugudan.calculate(first, last);
        UserGugudan.print(result);
    }
}