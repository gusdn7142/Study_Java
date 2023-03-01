import java.util.ArrayList;
import java.util.List;

public class MethodGugudan {

    /*
     * 구구단 계산 기능
     */
    static List<Integer> calculate(int number) {
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=9; i++) {   //구구단 계삽 값을 리스트에 저장
            result.add(number * i);
        }
        return result;
    }

    /*
     * 구구단 출력 기능
     */
    static void print(List<Integer> result){
        for (Integer resultElement : result) {
            System.out.print(resultElement + " ");
        }
        System.out.println();
    }

    /*
     * Method로 구구단 구현
     */
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            List<Integer> result = calculate(i);   //구구단 계산
            print(result);                         //구구단 출력
        }
    }
}