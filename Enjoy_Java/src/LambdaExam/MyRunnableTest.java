package LambdaExam;

public class MyRunnableTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable() {  //MyRunnable을 구현한 익명 객체 생성
            @Override
            public void run() {
                System.out.println("Myrunnable run!!");
            }
        };

        myRunnable.run();
    }
}
