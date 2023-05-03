package IOExam;

import java.io.StringReader;

public class InputToStringReader {
    public static void main(String[] args) throws Exception {

        //문자열 읽기
        StringReader in = new StringReader("helloworld!");

        int ch = -1;
        while((ch=in.read()) != -1){     //문자 단위로 읽으며 EOF(-1)이면 종료
            System.out.print((char)ch);  //int형을 char형으로 변환
        }
        in.close();
    }
}
