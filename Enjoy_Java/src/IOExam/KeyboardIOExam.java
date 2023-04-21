package IOExam;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {

        /*
         *  키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하기
         *  1. 키보드 : System.in (InputStream : 주인공)
         *             ,키보드로 입력받는다는 것은 char 단위 입출력을 의미
         *             ,char 단위 입출력 클래스는 Reader, Writer
         *  1.1 한줄 읽기 : BufferedReader라는 클래스는 readLime()이라는 메서드를 가짐
         *                ,더 이상 읽어들일것이 없으면(EOF) null을 반환,
         *                ,장식으로 InputStreamReader 사용
         *  2. 화면에 출력 : System.out (PrintStream : 주인공)
         *  2.1 한줄 쓰기 : PrintStream, PrintWriter
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while( (line = br.readLine()) != null ){      //한줄씩 입력받아 출력
            System.out.println("읽어들인 값 : " + line);
        }

    }
}
