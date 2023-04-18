package ExceptionExam;

public class Exception1 {

    public static void main(String[] args) {
        ExceptionObj1 exObj = new ExceptionObj1();
        try{
            int value = exObj.divide(10, 0);
            System.out.println(value);
        }
        catch(ArithmeticException ex){
            System.out.println("0으로 나눌수 없습니다.");
        }
    }
}

class ExceptionObj1 {

    public int divide(int i, int k) throws ArithmeticException{   //ArithmeticException (런타임 예외) 전달
        int value = 0;
        value = i / k;    //ArithmeticException (런타임 예외) 발생 가능

        return value;
    }
}
