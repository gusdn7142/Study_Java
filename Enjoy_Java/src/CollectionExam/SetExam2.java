package CollectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {

        //1. MyData 타입 Set 자료구조 생성
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 200));
        mySet.add(new MyData("hong", 700));
        mySet.add(new MyData("hong", 700));   //equals()와 hashCode() 메서드 재정의로 인해 중복값은 저장되지 않음.

        Iterator<MyData> iter = mySet.iterator();
        while(iter.hasNext()){              //다음 요소가 있는지 체크
            MyData myData2 = iter.next();   //요소 한개를 반환
            System.out.println(myData2);    //요소 출력
        }

    }
}

class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {   //HashSet의 add() 메서드에서 사용됨
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return this.value == myData.value && Objects.equals(this.name, myData.name);   //name과 value 값으로 이 객체 비교 값 전달
    }

    @Override
    public int hashCode() {                 //HashSet의 add() 메서드에서 사용됨
        return Objects.hash(name, value);   //name과 value 값으로 hashcode 생성
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}