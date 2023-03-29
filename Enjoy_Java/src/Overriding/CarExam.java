package Overriding;

public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car(20000, 5);
        Car car2 = new Car(20000, 5);
        Car car3 = new Car(15000,5);

        System.out.println(car1);  //자동차!!
        System.out.println(car2);  //자동차!!

        System.out.println(car1.equals(car2));  //true
        System.out.println(car1.equals(car3));  //false
        System.out.println(car1.hashCode());    //620122
        System.out.println(car2.hashCode());    //620122
        System.out.println(car3.hashCode());    //464566
    }

}
