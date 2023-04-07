package ArrayExam;

public class Array03 {
    public static void main(String[] args) {
        int[] arrays1 = new int[5];   //기본형 배열 생성
        arrays1[0] = 1;
        arrays1[1] = 2;
        arrays1[2] = 3;
        arrays1[3] = 4;
        arrays1[4] = 5;

        int[] arrays2 = new int[]{1,2,3,4,5};
        int[] arrays3 = {1,2,3,4,5};

        System.out.println("array1의 값 출력");
        for(int array1 : arrays1){
            System.out.println(array1);
        }

        System.out.println("array2의 값 출력");
        for(int array2 : arrays2){
            System.out.println(array2);
        }

        System.out.println("array3의 값 출력");
        for(int array3 : arrays3){
            System.out.println(array3);
        }

    }
}
