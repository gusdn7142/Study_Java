package CollectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {

        //1. String 타입 Set 자료구조 생성
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hong");
        set.add("hong");  //중복된 값은 저장되지 않음.

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){          //다음 요소가 있는지 체크
            String str = iter.next();   //요소 한개를 반환
            System.out.println(str);    //요소 출력
        }
    }
}
