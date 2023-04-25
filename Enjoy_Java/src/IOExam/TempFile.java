package IOExam;

import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {

        try {
            File f = File.createTempFile("tmp_", ".dat");  //파일명과 확장자 설정
            System.out.println(f.getAbsolutePath());                   //파일 경로 출력
            System.out.println("60초 동안 멈춰있습니다.");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit();      //JVM이 종료될때 임시파일을 자동으로 삭제
        } catch(IOException e2){
            System.out.println(e2);
        }

    }
}
