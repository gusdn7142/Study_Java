package IOExam;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MemoryOutput {
    public static void main(String[] args) throws Exception {

        int data1 = 1;
        int data2 = 2;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(data1);   //data1의 마지막 1byte만 저장 (0~255)
        out.write(data2);
        out.close();

        byte[] array = out.toByteArray();
        System.out.println("array.length : " + array.length);  //2
        System.out.println("array[0] : " + array[0]);          //1
        System.out.println("array[1] : " + array[1]);          //2
    }
}
