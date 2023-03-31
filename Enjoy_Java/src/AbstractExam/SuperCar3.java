package AbstractExam;

public class SuperCar3 extends Car3 {
    public SuperCar3(){
        super();    //자동으로 삽입되어 있음.
        System.out.println("SuperCar3() 기본 생성자 호출");
    }

    //추상 클래스 Car3의 추상 메서드 구현
    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }


}
