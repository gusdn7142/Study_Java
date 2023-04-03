package FinalExam;

public class StringTest {
    public static void main(String[] args) {

        String str1 = "hello";                      //string pool에 생성됨
        String str2 = "hello";                      //string pool에 생성됨
        String str3 = new String("hello");   //새로운 메모리에 생성됨
        String str4 = new String("hello");   //새로운 메모리에 생성됨

        if(str1==str2){                             //true
            System.out.println("str1 == str2");
        }
        if(str1==str3){                             //false
            System.out.println("str1 == str3");
        }
        if(str3==str4){                             //false
            System.out.println("str3 == str4");
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
