package ch17_Network_1027;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Network_ex4 {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL ("http://www.google.co.kr/ig/images/weather/sunny.gif");
			// 도메인을 인자로 하여 해당하는 URL 객체를 생성한다.
			
			URLConnection con = url.openConnection();
			// URL 객체의 openConnection() 메소드를 호출하여 URLConnection 객체를 리턴 받는다.
			
			con.connect();
			// URLConnection 객체의 connect() 메소드를 이용하여 원격지의 파일에 연결한다.
			
			System.out.println("문서의 타입 : "+ con.getContentType());
			System.out.println("마지막 수정일자 : " + new Date(con.getLastModified()));
			
			int len = con.getContentLength();
			
			System.out.println("문서의 길이 : " + len + "바이트");
			// 다양한 메소드를 사용하여 원격지에 있는 파일의 정보를 출력한다.
		} catch(Exception e) {e.printStackTrace();}	
	}
}
