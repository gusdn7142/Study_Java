package IOExam;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputToByte {
    public static void main(String[] args) throws Exception {

        OutputStream out = new FileOutputStream("C:/[path]/srcByteFile.dat");
        out.write(1);       //00000001
        out.write(255);     //11111111
        out.write(0);       //00000000
        out.close();
    }
}
