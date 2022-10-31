package ch17_Network_1027;

import java.net.URL; 

public class Network_ex3 {
	
	public static void main(String [] args) {
		
		try {
		
			URL url = new URL("http://www.google.co.kr/index.html");
			//요청한 도메인의 위치를 얻기 위해서, 해당 도메인을 인자로 하여 URL 객체를 생성한다.
		
			System.out.println(url.getProtocol());
			//요청한 도메인의 프로토콜 정보를 얻기 위해서 getProtocol() 메소드를 호출.
		
			System.out.println(url.getDefaultPort());
			//요청한 도메인의 기본 포트 정보를 얻기 위해서 getDefaultPort() 메소드를 호출.
		
			System.out.println(url.getHost());
			//요청한 도메인의 호스트 정보를 얻기 위해서 getHost() 메소드를 호출한다.
		
			System.out.println(url.getFile());
			// 요청한 파일 자원의 정보를 얻기 위해서 getFile() 메소드를 호출한다.
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
