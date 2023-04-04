package InterfaceExam;



public class LottoMachineImpl implements LottoMachine {

    private Ball[] balls;

    //45개의 Ball을 배열로 받아 저장하는 기능
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    //45개의 Ball들을 섞는 기능
    @Override
    public void mixs() {
        for(int i=0; i<10000; i++){                                                //10000번 랜덤값 2개(x1, x2)를 생성
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);           //Math.random()은 0.0이상 1.0미만 값을 x1에 반환 => 45를 곱하여 0 ~ 44까지의 값을 반환
            int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);           //Math.random()은 0.0이상 1.0미만 값을 x2에 반환 => 45를 곱하여 0 ~ 44까지의 값을 반환
            if(x1 != x2){                                                          //0~45까지의 랜덤 숫자 x1과 x2가 일치하지 않으면 balls[x1]과 balss[x2]의 값을 바꿈
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    //6개의 Ball을 반환하는 기능
    @Override
    public Ball[] getBall() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];   //Ball 6개를 참조하는 배열
        for (int i=0; i<result.length; i++){
            result[i] = balls[i];
        }
        return result;       //섞인 6개의 ball을 담은 Ball 배열 반환
    }

}
