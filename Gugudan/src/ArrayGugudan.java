import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayGugudan {

    public static void main(String[] args) {

        //List로 구구단 구현
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=9; i++){
            list.add(new ArrayList<Integer>());  //구구단 값 저장
        }

        for(int i=2; i<list.size(); i++){
            for(int j=1; j<list.size(); j++) {
                list.get(i).add(i * j);
            }
        }

        //List 구구단 출력1
        for(int i=2; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        //List 구구단 출력2 (스트림 사용)
        Stream<List<Integer>> listStream = list.stream();
        listStream.skip(2)    //0단과 1단은 제외
                .forEach(gugudanList -> {
                    for (int gugudan : gugudanList) {
                        System.out.print(gugudan + " ");
                    }
                    System.out.println();
                });
    }
}
