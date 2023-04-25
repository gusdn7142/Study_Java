package IOExam;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam01 {
    public static void main(String[] args) {

        InputStream in = null;
        try{
            int data = in.read();
        } catch(IOException ex){
            System.out.println("in 오류 :" + ex);
        } finally {
            try{
                in.close();
            } catch (Exception ex2){
                System.out.println("in 오류2 :" + ex2);
            }
        }

    }
}
