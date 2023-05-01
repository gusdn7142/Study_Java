package IOExam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileOutputToDataOutputStream {
    public static void main(String[] args) throws Exception {

        //학생의 이름, 국어 성적, 영어 성적, 수학 성적, 총점, 평균 점수를 파일에 쓰기
        String name ="Choi";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/[path]/hello.txt"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();
    }
}
