package IOExam;

import ConstructorExam.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InputToObjectInputStream {

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/[PATH]/userList.txt"));
        ArrayList<User> list = (ArrayList)in.readObject();   //파일에서 ArrayList<User> 객체를 역직렬화해서 조회
        in.close();

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));   //User 객체 조회
        }

    }
}
