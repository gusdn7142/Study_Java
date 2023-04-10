package ArrayExam;

import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {

        int[] copyFrom = {1, 2, 3};
        int[] copyTo1 = Arrays.copyOf(copyFrom, copyFrom.length);   //배열 깊은 복사 (새로운 배열이 생성됨)
        for(int c : copyTo1){
            System.out.println(c);
        }
        System.out.println("--------------------------------");

        int[] copyTo2 = Arrays.copyOf(copyTo1, copyTo1.length);   //배열 깊은 복사 (새로운 배열이 생성됨)
        for(int c : copyTo2){
            System.out.println(c);
        }

        if(copyTo1 == copyTo2){   //false
            System.out.println("copyTo1와 copyTo2는 같은 배열");
        }
        else System.out.println("copyTo1와 copyTo2는 다른 배열");

        System.out.println("--------------------------------");

        int[] copyTo3 = copyTo2;   //배열 얕은 복사 (주소 참조)
        for(int c : copyTo3){
            System.out.println(c);
        }

        if(copyTo2 == copyTo3){   //true
            System.out.println("copyTo2와 copyTo3는 같은 배열");
        }
        else System.out.println("copyTo2와 copyTo3는 다른 배열");
    }


}
