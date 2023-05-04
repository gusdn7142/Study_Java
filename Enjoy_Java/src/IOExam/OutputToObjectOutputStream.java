package IOExam;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OutputToObjectOutputStream {

    public static void main(String[] args) throws Exception {
        User user1 = new User("test1@example.com", "test1", 1990);
        User user2 = new User("test2@example.com", "test2", 1991);
        User user3 = new User("test3@example.com", "test3", 1992);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/[PATH]/userList.txt"));
        out.writeObject(list);        //파일에 ArrayList<user> 객체를 직렬화해서 저장
        out.close();

    }
}
