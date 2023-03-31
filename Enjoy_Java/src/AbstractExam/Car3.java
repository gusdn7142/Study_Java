package AbstractExam;

public abstract class Car3 {
    public Car3(){
        super();    //자동으로 삽입되어 있음. (부모 클래스에 기본 생성자가 없으면 super 안에 인수를 넣어야 함)
        System.out.println("Car3() 기본 생성자 호출");
    }

    //추상 메서드 선언
    public abstract void run();
}
