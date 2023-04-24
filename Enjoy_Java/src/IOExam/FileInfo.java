package IOExam;

import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("사용법 : java FileInfo 파일이름");
            System.exit(0);   //return
        }

        File f = new File(args[0]);
        if(f.exists()){ //파일이 존재할 경우

            System.out.println("length : "+ f.length());       //파일 길이 조회
            System.out.println("canread :" + f.canRead());     //파일 읽기가 가능한지 조회
            System.out.println("canWrite :" + f.canWrite());   //파일 쓰기가 가능한지 조회
            System.out.println("getAbsolutePath :" + f.getAbsolutePath());   //파일의 절대 경로를 조회

            try{
                System.out.println("getCanIcalPath :" + f.getCanonicalPath());   //파일의 전체 경로를 조회
            }
            catch(IOException e){
                System.out.println(e);
            }

            System.out.println("getName :" + f.getName());      //파일 or 디렉터리 이름 조회
            System.out.println("getParent :" + f.getParent());  //부모 경로 조회
            System.out.println("getPath :" + f.getPath());      //파일 경로 조회
        } else { //파일이 존재하지 않을 경우
            System.out.println("파일이 존재하지 않습니다.");
        }

    }
}
