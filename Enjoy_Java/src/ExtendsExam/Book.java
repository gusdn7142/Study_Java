package ExtendsExam;

public class Book {

    private String title;
    private int price;
    private String author;
    private int year;
    private String publisher;


    //getter() 생성
    public int getPrice() {   //price 프로퍼티를 가짐.. 메서드명에 종속적
        return this.price * 2;
    }

    public String getTitle() {   //title 프로퍼티를 가짐.. 메서드명에 종속적
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }


    //setter()
    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}