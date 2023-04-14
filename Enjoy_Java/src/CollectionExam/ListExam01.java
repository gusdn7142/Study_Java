package CollectionExam;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {

        //1. Generic을 사용하지 않은 ArrayList
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0);   //조회시 형변환 필요
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        //2. Generic을 사용한 ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("kim");
        list2.add("lee");
        list2.add("hong");

        String str4 = list2.get(0);   //조회시 형변환 필요 없음
        String str5 = list2.get(1);
        String str6 = list2.get(2);

        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);


    }


}
