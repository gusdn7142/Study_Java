package IOExam;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MemoryInput {
    public static void main(String[] args) throws Exception {

        byte[] array = new byte[2];
        array[0] = (byte) 1;
        array[1] = (byte) 2;

        ByteArrayInputStream in = new ByteArrayInputStream(array);
        int read1 = in.read();   //한 바이트씩 읽기 (0~255)
        int read2 = in.read();
        int read3 = in.read();
        in.close();

        System.out.println(read1);  //1
        System.out.println(read2);  //2
        System.out.println(read3);  //-1
    }
}
