package ArrayExam;

public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] arrays1;   //참조형 배열 선언
        ItemForArray[] arrays2;

        arrays1 = new ItemForArray[5];
        arrays2 = new ItemForArray[5];

        arrays1[0] = new ItemForArray(500, "Item01");
        arrays2[1] = new ItemForArray(1000, "Item02");

        System.out.println(arrays1[0].getName() + " , " + arrays1[0].getPrice());
        System.out.println(arrays2[1].getName() + " , " + arrays2[1].getPrice());
    }
}
