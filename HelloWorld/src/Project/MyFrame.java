package Project;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Frame 만들기");
		setSize(600,600);
		setVisible(true);
}
	public static void main(String [] args) {
		MyFrame mf = new MyFrame();
	}
}
