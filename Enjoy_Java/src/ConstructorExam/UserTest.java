package ConstructorExam;

public class UserTest {

    public static void main(String[] args) {

        User user1 = new User("abc@5678","BoB");
        System.out.println(user1.getEmail());
        System.out.println(user1.getName());
        System.out.println(user1);

        User user2 = new User("abc@1234", "1234", "Duck");
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2.getName());
        System.out.println(user2);

    }

}
