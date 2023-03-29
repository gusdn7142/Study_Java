package Overriding;

import java.util.Objects;

public class Car {
    private int gas;
    private int age;

    public void run(){
        System.out.println("전륜 구동으로 달리다");
    }

    public Car(){ }

    public Car(int gas, int age) {
        this.gas = gas;
        this.age = age;
    }

    @Override
    public String toString() {
        return "자동차!!";
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return this.gas == car.gas && this.age == car.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gas, age);
    }
}
