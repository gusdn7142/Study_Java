package OverrodingExam;

public class OverrodingTest {

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
        OverrodingTest overrodingTest = new OverrodingTest();
        overrodingTest.println(100);
        overrodingTest.println("hello");
        overrodingTest.println(10.5);
        overrodingTest.println(false);
    }

}
