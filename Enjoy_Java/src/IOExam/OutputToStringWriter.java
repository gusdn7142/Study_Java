package IOExam;

import java.io.StringWriter;

public class OutputToStringWriter {
    public static void main(String[] args) throws Exception{

        //문자열 쓰기
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.write("!");
        out.close();

        String str = out.toString();  //문자열 조회
        System.out.println(str);      //helloworld!
    }
}
