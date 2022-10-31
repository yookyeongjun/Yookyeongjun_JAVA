package ch17_Network_1027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Network_ex2 {
	
	public static void main(String[] args) {
		
		BufferedReader buffer = null;
		
		try {
			URL url = new URL("http://www.google.com");
			//요청한 도메인의 위치를 얻기 위해서 해당 도메인을 인자로 하여 URL 객체를 생성한다.
			
			InputStream in = url.openStream();
			// URL 객체로부터 InputStream 객체를 얻기 위해서 openStream() 메소드를 호출한다. 
			
			InputStreamReader reader = new InputStreamReader(in);
			buffer = new BufferedReader(reader);
			String s = buffer.readLine();
			
			while(s != null) {
				System.out.println(s);
				s = buffer.readLine();
			} // end while
			
			// Filter 계열의 InputStreamReader 와 BufferedReader 클래스를 이용하여 요청 도메인 (www.naver.com)의 기본 (홈페이지) 파일을 읽어, 해당 파일의 내용인 HTML 정보를 콘솔에 출력한다.
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				buffer.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
