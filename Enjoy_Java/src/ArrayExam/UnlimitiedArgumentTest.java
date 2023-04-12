package ArrayExam;

public class UnlimitiedArgumentTest {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(1,2,4,2));
        System.out.println(sum(3,1,2,3,4,1));
    }

    public static int sum(int... args){   //제한 없는 arguments
        System.out.println("args의 길이 : " + args.length);
        int sum = 0;
        for(int i=0; i<args.length; i++){
            sum += args[i];
        }
        return sum;
    }

}
