package Overriding;

public class Bus extends Car{

    public void 안내방송(){
        System.out.println("안내방송하다.");
    }

    @Override
    public void run(){
        System.out.println("후륜구동으로 달리다.");
    }

}
