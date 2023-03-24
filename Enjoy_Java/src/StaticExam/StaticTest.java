package StaticExam;

public class StaticTest {

    static int number;
    static{            //static 블록
        number = 500;
        System.out.println("Static Print" + number);   //1순위로 출력
    }

    public static void main(String[] args) {
        System.out.println("main() Method Print");        //2순위로 출력
    }

}
