package Jeneric;

public class GenericBoxMain {
    public static void main(String[] args) {

        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("kim");                 //String 타입으로 값 입력
        String str = genericBox.get();         //String 타입 값 조회
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(new Integer(5));      //Integer 타입으로 값 입력
        Integer intValue = intBox.get();       //Integer 타입 값 조회
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.set("hello");                 //Object 타입으로 값 입력
        String str2 = (String)objBox.get(); //Object 타입을 조회 후 String 타입으로 형변환
        System.out.println(str2);
    }

}
