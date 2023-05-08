package ThreadExam;


public class MyRunnableExam {
    public static void main(String[] args) throws Exception {

        String name = Thread.currentThread().getName();;
        System.out.println("Thread_name : " + name);
        System.out.println("start!");

        //1. Thread 생성
        MyRunnable mr1 = new MyRunnable("*");
        MyRunnable mr2 = new MyRunnable("+");

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        //2. thread 실행
        t1.start();   //동기화 이슈는 락(synchronized)으로 해결
        t1.join();
        t2.start();
        t2.join();

        System.out.println("end!");
    }
}
