package ch17_Network_1027;

import java.net.*;
import java.io.*;
public class Network_ex6 {
	
	public static void main(String[] args) {
		
		ServerSocket s = null;
		// 5432 포트를 이용하여 클라이언트가 접속하도록 ServerSocket 클래스를 생성한다.
		
		try {
			s = new ServerSocket(5432);
		} catch(Exception e) {e.printStackTrace();}
		
		try {
			while(true){
				// 일반적으로 서버는 항상 실행 중이어야 하기 때문에 무한루프로 실행시킨다.
				
				Socket s1 = s.accept();
				// accept() 메소드를 사용하여 클라이언트가 접속하기를 기다린다. 
				// 클라이언트가 접속이 되면 ServerSocket은 내부적으로 Socket 객체를 하나 생성하여 클라이언트가 접속한 Socket을 대응하는 역할을 맡긴다.
				
				OutputStream os = s1.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject("Hello World");
				// 클라이언트에게 "Hello World"문자열을 출력시키기 위해서 OutputStream을 얻고 
				// filter 계열인 ObjectOutputStream 클래스의 writeObject 메소드를 이용하여 데이터를 출력시킨다.
				
				oos.close();
				s1.close();
				//사용된 자원을 해제한다.
			}
		} catch(Exception e) { e.printStackTrace();}
	}	
}
