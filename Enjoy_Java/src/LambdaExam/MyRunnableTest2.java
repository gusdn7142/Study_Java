package LambdaExam;

public class MyRunnableTest2 {

    public static void main(String[] args) {

//        MyRunnable myRunnable = new MyRunnable() {  //MyRunnable을 구현한 익명 객체 생성
//            @Override
//            public void run() {
//                System.out.println("hello!!");
//            }
//        };

        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(() -> {  //MyRunnable을 구현한 익명 객체를 람다식으로 만들어 인수로 삽입
                System.out.println("hello!!");
        });

    }
}
