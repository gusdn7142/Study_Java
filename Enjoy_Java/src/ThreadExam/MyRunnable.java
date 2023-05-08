package ThreadExam;

public class MyRunnable implements Runnable {

    private String str;

    public MyRunnable(String str){
        this.str = str;
    }

    @Override
    public void run(){
        synchronized(MyRunnable.class) {   //동기화 적용
            String name = Thread.currentThread().getName();
            System.out.println("--- " + "Thread_name : " + name + " ---");

            for (int i = 0; i < 10; i++) {
                System.out.print(str);
                try {
                    Thread.sleep(1000);  //1초마다 쉼

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }


}
