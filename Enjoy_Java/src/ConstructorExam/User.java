package ConstructorExam;

public class User {

    private String email;
    private String password;
    private String name;

    public User(){ }

    public User(String email, String name) {
        this(email,null, name);   //this()는 생성자의 첫 번째줄에 위치해야 함
    }

    //생성자 오버로딩
    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                //", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
