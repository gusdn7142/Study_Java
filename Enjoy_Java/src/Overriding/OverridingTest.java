package Overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();     //후륜구동으로 달리다.
        b1.안내방송();  //안내방송하다.

        Car c1 = new Bus();  //버스는 자동차다
        c1.run();     //후륜구동으로 달리다.
        //오류 발생 : c1.안내방송();

        Bus b2 = (Bus) c1;
        b2.안내방송();  //안내방송하다.

        Car c2 = new SuperCar();
        c2.run();     //사륜구동으로 달리다
    }
}
