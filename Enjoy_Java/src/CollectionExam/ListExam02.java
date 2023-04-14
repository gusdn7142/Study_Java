package CollectionExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {

        //1. ArrayList 객체 생성시 Collection 타입으로 참조 :  get() 메서드 사용 불가
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());  //3

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){          //다음 요소가 있는지 체크
            String str = iter.next();   //요소 한개를 반환
            System.out.println(str);    //요소 출력
        }


        //2. ArrayList 객체 생성시 List 타입으로 참조 : get() 메서드 사용 가능
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
