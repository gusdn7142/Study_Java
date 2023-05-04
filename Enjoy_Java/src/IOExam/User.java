package IOExam;

import java.io.Serializable;

public class User implements Serializable {   //직렬화 가능한 클래스
    private String email;                     //직렬화 가능한 필드
    private String name;                     //직렬화 가능한 필드
    private int birthYear;                   //직렬화 가능한 필드

    public User(String email, String name, int birthYear){
        this.email = email;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
