package ConstructorExam;

public class Car2 {
    public Car2(){
        super();    //자동으로 삽입되어 있음. (부모 클래스에 기본 생성자가 없으면 super 안에 인수를 넣어야 함)
        System.out.println("Car2() 생성자 호출");
    }
}
