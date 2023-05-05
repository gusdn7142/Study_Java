package ThreadExam;

public class MyThreadExam {
    public static void main(String[] args) throws Exception {

        String name = Thread.currentThread().getName();;
        System.out.println("Thread_name : " + name);
        System.out.println("start!");

        //1. Thread 생성
        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        //2. thread 실행
        mt1.start();   //동기화 이슈는 락(synchronized)으로 해결
        //mt1.join();
        mt2.start();
        //mt2.join();

        System.out.println("end!");
    }
}
