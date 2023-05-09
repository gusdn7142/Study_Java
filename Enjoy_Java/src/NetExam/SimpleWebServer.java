package NetExam;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class SimpleWebServer {
    public static void main(String[] args) throws Exception {

        //9090포트로 대기
        ServerSocket ss = new ServerSocket(9090);

        //1. 클라이언트를 연결 요청 대기
        System.out.println("클라이언트 접속을 기다림");
        Socket socket = ss.accept();    //socket은 클라이언트와 통신할 수 있는 객체

        //클라이언트 정보를 읽고 쓸수 있는 OutputStream, InputStream 조회
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();

        //2. 클라이언트의 요청 메시지 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();           //(브라우저에 127.0.0.1:9090을 입력시의) 요청 HTTP Method와 URL 읽기
        List<String> headers = new ArrayList<>();

        String line = null;
        while(!(line = br.readLine()).equals("")){  //빈 줄이 아닐때까지 읽기
            headers.add(line);                      //(브라우저에 127.0.0.1:9090을 입력시의) 헤더 정보를 한줄씩 list에 입력
        }

        System.out.println(firstLine);
        for(int i=0; i<headers.size(); i++){
            System.out.println(headers.get(i));     //헤더 정보 출력
        }


        //3. 클라이언트에게 응답 메시지 전송
        pw.println("HTTP/1.1 200 OK");
        pw.println("name: Depth");
        pw.println();
        pw.println("<html>");
        pw.println("<h1> hello!!! </h1>");
        pw.println("</html>");
        pw.close();

        //byte[] buffer = new byte[512];
        //int readCount = 0;
        //while((readCount = in.read(buffer)) != -1){        //(브라우저에 127.0.0.1:9090을 입력하면) 클라이언트 정보를 화면에 출력
        //    System.out.write(buffer, 0 , readCount);
        //}

        //System.out.println(socket.toString());

        ss.close();
        System.out.println("서버가 종료되었습니다.");

    }
}
