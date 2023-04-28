package IOExam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class FileInputToBufferdReader {
    public static void main(String[] args) throws Exception {

        //BufferedReader로 파일 한줄씩 읽기
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:/[path]/hello.txt")));

        String line = "";
        while((line = in.readLine()) != null){
            System.out.println(line);
        }
    }
}
