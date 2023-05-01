package IOExam;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class FileInputToDataInputStream {
    public static void main(String[] args) throws Exception {

        DataInputStream in = new DataInputStream(new FileInputStream("C:/[path]/hello.txt"));

        //학생의 이름, 국어 성적, 영어 성적, 수학 성적, 총점, 평균 점수를 파일에서 읽기
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();
        in.close();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
