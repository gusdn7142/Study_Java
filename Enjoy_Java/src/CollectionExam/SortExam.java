package CollectionExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list);       //list 오름차순 정렬
        //Collections.shuffle(list);  //list 랜덤 섞기

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  //hong kim lee
        }
    }
}
