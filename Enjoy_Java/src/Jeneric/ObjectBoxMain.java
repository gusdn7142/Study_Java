package Jeneric;

public class ObjectBoxMain {
    public static void main(String[] args) {

        ObjectBox box = new ObjectBox();
        box.set("kim");                 //Object 타입으로 값 입력
        String str = (String)box.get(); //Object 타입을 String 타입으로 형변환
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));  //Object 타입으로 값 입력
        Integer i = (Integer)box.get(); //Object 타입을 Integer 타입으로 형변환
        System.out.println(i);
    }
}
