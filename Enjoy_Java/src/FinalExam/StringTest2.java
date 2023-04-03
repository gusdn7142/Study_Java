package FinalExam;

public class StringTest2 {
    public static void main(String[] args) {

        String str1 = "hello";                      //string pool에 생성됨
        String str2 = new String("hello");   //새로운 메모리에 생성됨

        if(str1.equals(str2)){                             //true (값이 같은지 확인)
            System.out.println("str1와 str2의 값이 같다.");
        }

        String subString = str1.substring(3);    //새로운 매모리에 생성됨
        System.out.println(subString);                    //lo
        System.out.println(str1);                         //hello
    }
}
