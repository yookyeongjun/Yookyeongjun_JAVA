package ch17_Network_1027;

import java.net.InetAddress;

public class Network_ex1 {
	
	public static void main(String [] args) {
		
		try {
			String name = "www.naver.com";
			// 요청하고자 하는 도메인명을  String에 저장한다.
			
			InetAddress inetAddr = InetAddress.getByName(name);
			// 요청 도메인에 대한 정보를 가진 InetAddress 클래스를 얻어온다.
			
			String hostName = inetAddr.getHostName();
			String hostAddress = inetAddr.getHostAddress();
			System.out.println(hostName + " " + hostAddress);
			//getHostName() 메소드와 getHostAddress() 메소드를 사용하여 호스트명과
			//호스트 주소를 얻는다.
			
			InetAddress localHost = InetAddress.getLocalHost();
			//로컬(현재 자신의 컴퓨터) 컴퓨터의 네트워크 정보를 얻기 위해서
			//getLocalHost() 메소드를 호출한다.
			
			String localName = localHost.getHostName();
			String localAddress = localHost.getHostAddress();
			System.out.println(localName + " " + localAddress);
			//로컬의 호스트명과 호스트 주소를 얻는다. 
			
			byte [] b = localHost.getAddress();
			// 로컬의 호스트 주소를 byte 배열로 얻는다.
			//자바의 byte 값은 -128~ 127 값을 갖게 되므로
			// 0~255 사이 값으로 변환해야 한다.
			// 음수일 때 변환 작업 수행.
			
			for (int x =0; x < b.length ; x++) {
			
				System.out.print(((b[x] < 0 ) ? (b[x] + 255) : b[x] )+ ".");
			}
			
		} catch (Exception e) {e.printStackTrace();}
	}
}
