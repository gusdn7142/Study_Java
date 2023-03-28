package ExtendsExam;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        //book1.price = 100;
        //System.out.println(book1.price);

        book1.setTitle("즐거운 자바");
        book1.setPrice(100);
        book1.setAuthor("Depth");
        book1.setPublisher("Roophy");
        book1.setYear(2023);
        System.out.println(book1.getPrice());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getYear());
    }
}
