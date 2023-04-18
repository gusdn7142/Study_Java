package CollectionExam;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {

        //1. <String. String>타입 HashMap 자료구조 생성
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕");                //중복된 key 값은 저장되지 않음.

        System.out.println(map.get("k1"));   //key를 통해 value 조회
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));

        //HashMap의 모든 key와 value 출력
        Set<String> keySet = map.keySet();      //모든 Key 조회
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){              //다음 key 요소가 있는지 체크
            String key = iterator.next();       //key 요소 한개를 반환
            String value = map.get(key);        //key를 통해 value 조회
            System.out.println(key + " : " + value);    //요소 출력
        }

    }
}
