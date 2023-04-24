package IOExam;

import java.io.File;
import java.io.IOException;

public class FileList {
    public static void main(String[] args) throws IOException {

        File file = new File("src/IOExam");
        printFiles(file);
    }

    private static void printFiles(File file) throws IOException {
        if(file.isDirectory()){  //해당 경로가 디렉터리라면
            File[] files = file.listFiles();  //해당 경로에서 디렉터리와 파일 목록 조회

            for(int i=0; i<files.length; i++){
                if(files[i].isDirectory()){                             //내부에 디렉터리가 존재하면
                    System.out.println("[dir] = " + files[i].getName());  //디렉터리명 출력
                }
                else printFiles(files[i]);                              //내부에 파일이 존재하면 재귀함수 호출
            }
        }
        else if(file.isFile()){  //해당 경로가 파일이라면
            System.out.println("[filename] : " + file.getName());   //파일명 출력
        }
    }

}
