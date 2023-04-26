package IOExam;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputToByte {
    public static void main(String[] args) throws Exception {

        InputStream in = new FileInputStream("C:/[path]/srcByteFile.dat");
        int buf = 1;
        while((buf = in.read()) != -1){    //buf가 eof(-1)이면 탈출
            System.out.println(buf);       //한 바이트씩 읽어서 출력 (ex, 1 ,255, 0)
        }
        in.close();

    }
}
