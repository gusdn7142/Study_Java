package OverlodingExam;

public class OverlodingTest {

    public void println(boolean b){
        System.out.println(b);
    }

    public void println(int i){
        System.out.println(i);
    }

    public void println(double d){
        System.out.println(d);
    }

    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        OverlodingTest overlodingTest = new OverlodingTest();
        overlodingTest.println(100);
        overlodingTest.println("hello");
        overlodingTest.println(10.5);
        overlodingTest.println(false);
    }

}
