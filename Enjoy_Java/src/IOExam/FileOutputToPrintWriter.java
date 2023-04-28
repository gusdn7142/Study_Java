package IOExam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileOutputToPrintWriter {
    public static void main(String[] args) throws Exception {

        //PrintWriter로 파일에 쓰기
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:/[path]/hello.txt")));

        out.println("hello1");
        out.println("hello2");
        out.println("hello3");

        out.close();
    }
}
