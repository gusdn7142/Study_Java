package IOExam;

import java.io.FileReader;
import java.io.Reader;

public class FileInputToReader {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("C:/[path]/hello.txt");

        int ch = -1;
        while((ch = in.read()) != -1){          //buf가 eof(-1)이면 탈출
            System.out.println((char)ch);       //문자 단위로 읽어서 출력
        }
        in.close();
    }
}
