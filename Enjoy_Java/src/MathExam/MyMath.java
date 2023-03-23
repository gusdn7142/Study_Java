package MathExam;

public class MyMath {

    public static int abs(int x){   //외부에서 abs() 메서드를 클래스명으로 직접 호출 가능
        if(x<0) return x * -1;
        else return x;
    }

    private MyMath() { }  //외부(ex, 다른 패키지)에서 생성자 호출 불가
}


