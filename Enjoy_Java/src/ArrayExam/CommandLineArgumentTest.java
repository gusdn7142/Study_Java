package ArrayExam;

public class CommandLineArgumentTest {
    public static void main(String[] args) {

        //args 값이 없다면 종료
        if(args.length==0){
            System.out.println("CommanLineArgument 0");
            System.exit(0);
        }

        //args 값이 있다면 출력
        for(String arg : args) {
            System.out.println(arg);
        }

    }
}
