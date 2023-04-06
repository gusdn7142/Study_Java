package LambdaExam;

public class RunnableExecute {
    public void execute(MyRunnable myRunnable){   //함수형 인터페이스를 매개변수로 받음
        myRunnable.run();
    }
}
