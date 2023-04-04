package InterfaceExam;



public class LottoMachineMain {

    public static void main(String[] args) {

        //Ball 인스턴스를 45개 참조할 수 있는 balls 배열
        Ball[] balls = new Ball[45];

        for(int i=0; i<balls.length; i++) {
            balls[i] = new Ball(i+1);    //ex, balls[0] = 1 ...  balls[44] = 45
        }

        //LottoMachineImpl 구현체로 LottoMachine 인스턴스 생성
        LottoMachine lottoMachine = new LottoMachineImpl();

        //LottoMachine에 45개의 Ball 입력
        lottoMachine.setBalls(balls);

        //45개의 Ball을 섞음
        lottoMachine.mixs();

        //섞인 6개의 Ball 조회 후 출력
        Ball[] result = lottoMachine.getBall();

        for(int i=0; i<result.length; i++) {
            System.out.println(result[i].getNumber());
        }

    }
}
