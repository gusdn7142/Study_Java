package ArrayExam;


import java.util.Arrays;
import java.util.Comparator;

public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};

        //Arrays.copyOfRange() 메서드 사용
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);   //배열 복사
        for(char c: copyTo){
            System.out.print(c);  //el
        }
        System.out.println();


        //Arrays.compare() 메서드 사용 : 양수, 0, 음수로 return
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        int compare = Arrays.compare(array1, array2);   //배열 비교 : 0
        System.out.println(compare);


        //Arrays.sort() 메서드 사용
        int[] array3 = {5, 4, 3, 1, 2};
        Arrays.sort(array3);  //배열 오름차순 정렬

        for(int i : array3){
            System.out.print(i + ",");  //1,2,3,4,5
        }
        System.out.println();


        //Arrays.binarySearch() 메서드 사용 : 사전 조건으로 배열이 정렬되어 있어야 함.
        int[] array4 = {5, 4, 3, 1, 2};
        Arrays.sort(array4);  //배열 오름차순 정렬

        int index = Arrays.binarySearch(array4, 4);   //배열에서 이진탐색을 하며 4가 위치한 index 반환
        System.out.println(index);   //3


        //Arrays.sort() 활용 : 객체 배열 정렬
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("c#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        //Arrays.sort(items);                    //내부 정렬 방식 사용
        //Arrays.sort(items, new ItemSorter());  //외부 정렬 방식 사용
        Arrays.sort(items, (Object o1, Object o2) -> {  //외부 정렬 방식을 익명 객체(+람다식)로 표현
                Item item1 = (Item) o1;
                Item item2 = (Item) o2;
                return item1.getName().compareTo(item2.getName());  //이름을 가,나,다 순으로 비교 후 양수, 0, 음수로 리턴
                //return item1.getPrice() - item2.getPrice();       //가격의 차이를 양수, 0, 음수로 리턴
        });

        for(Item item : items){
            System.out.println(item);  //Item 객체의 name 필드를 기준으로 오름차순 정렬
        }

    }
}



//함수형 인터페이스 구현
class ItemSorter implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getName().compareTo(item2.getName());  //이름을 가,나,다 순으로 비교 후 양수, 0, 음수로 리턴
        //return item1.getPrice() - item2.getPrice();       //가격의 차이를 양수, 0, 음수로 리턴
    }
}



class Item implements Comparable {  //Comparable는 어떤 Item이 큰지, 작은지 기준을 정하는 인터페이스
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //파라미터로 들어온 Object와 자기 자신을 비교하는 메서드
    @Override
    public int compareTo(Object o) {
        Item item = (Item) o;
        return this.name.compareTo(item.name);  //이름을 가,나,다 순으로 비교 후 양수, 0, 음수로 리턴
        //return this.price - item.price;       //가격의 차이를 양수, 0, 음수로 리턴
    }
}