package AbstractExam;

public class Car3Test {
    public static void main(String[] args) {
        //Car3 car3 = new Car3("Roophy");   //abstract 클래스이기 떄문에 인스턴스 생성 불가
        Bus3 bus3 = new Bus3();
        bus3.run();

        SuperCar3 superCar3 = new SuperCar3();
        superCar3.run();

        //Car3 추상클래스는 Bus3 혹은 SuperCar3 클래스로 인스턴스를 만들어 낼 수 있다.
        Car3 car3 = new Bus3();
        car3.run();

        System.out.println();

        //Car3 추상클래스는 인스턴스를 직접 생성할 수 없지만 배열로 만들어 참조하여 자식 클래스를 인스턴스로 생성할 수 있다.
        Car3[] array = new Car3[2];
        array[0] = new Bus3();
        array[1] = new SuperCar3();

        for(Car3 c3 : array){
            c3.run();
        }


    }
}
