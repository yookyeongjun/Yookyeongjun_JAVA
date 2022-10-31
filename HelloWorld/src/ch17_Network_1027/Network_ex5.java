package ch17_Network_1027;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Network_ex5 {
	
	public static void main(String[] args) {
		
		try {
			String original = "[Java Solution : 홍길동]";
			// 인코딩할 문자열을 저장한다.
			
			String encodeStr = URLEncoder.encode(original, "EUC-KR");
			// URLEncoder 클래스의 encode 메소드를 이용하여 요청 문자열을 인코딩한다.
			
			String decodeStr = URLDecoder.decode(encodeStr, "EUC-KR");
			// URLEncoder 클래스의 decode 메소드를 이용하여 인코딩된 문자열을 디코딩하여 원래의 문자열로 변환되는지 확인한다.
			
			System.out.println(original);
			System.out.println(encodeStr);
			System.out.println(decodeStr);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
