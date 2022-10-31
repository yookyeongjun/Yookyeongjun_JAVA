package ch17_Network_1027;

import java.net.*;
import java.io.*;

public class Network_ex6_2 {
	
	public static void main(String[] args) {
		
		try {
			Socket s1 = new Socket("localhost",5432);
			//서버 ip 주소와 5432 포트를 이용한 Socket 클래스를 생성한다.
			
			InputStream is = s1.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println(ois.readObject());
			//서버에서 출력시킨 데이터를 입력하기 위해서 InputStream을 얻는다.
			//filter 계열인 ObjectInputStream 클래스의 readObject 메소드를 이용하여 데이터를 입력 받는다.
			
			ois.close();
			is.close();
			s1.close();
			//사용된 자원을 해제한다.
		} catch(Exception e) {e.printStackTrace();}
	}
}
