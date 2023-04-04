package InterfaceExam;


/*
 * 1. 1~45까지 써있는 45개의 Ball을 로또 기계에 넣는다
 * 2. 로또 기계에 있는 Ball들을 섞는다.
 * 3. 섞인 Ball중에서 6개를 꺼낸다.
 */
public interface LottoMachine {

    public static final int MAX_BALL_COUNT = 45;    //Ball의 최대 개수
    public static final int RETURN_BALL_COUNT = 6;  //반환할 Ball의 개수

    public abstract void setBalls(Ball[] balls);    //45개의 Ball을 배열로 받음
    public abstract void mixs();                    //Ball들을 섞음
    public abstract Ball[] getBall();               //6개의 Ball을 반환
}
