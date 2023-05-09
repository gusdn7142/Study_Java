package NetExam;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {

        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());         //Local PC의 IP주소 조회
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com");
            for(InetAddress ia : iaArray)
            System.out.println(ia.getHostAddress());         //google의 IP주소 조회
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
