package Overriding;

public class SuperCar extends Car {
    @Override
    public void run() {
        System.out.println("사륜구동으로 달리다");
    }
}
