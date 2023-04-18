package ExceptionExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
    public static void main(String[] args) {

        //컴파일 예외 (FileNotFoundException) 발생에 대한 처리 필요
        try {
            FileInputStream fis = new FileInputStream("Exception3.java");
        } catch (FileNotFoundException e) {
            System.out.println("file을 찾을 수 없습니다");
        }

    }
}
