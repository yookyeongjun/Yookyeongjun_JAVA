package baseball;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class Main extends JFrame {
	
    JScrollPane scrollPane;
    ImageIcon icon;
    Button btn1, btn2;
 
    public Main() {
    	
    	super("게임모드");
    	setLayout(null);
    	
        icon = new ImageIcon("C:/Users/admin/git/Yookyeongjun_JAVA/HelloWorld/src/image/baseballpark.png");
           
        JPanel background = new JPanel() {
        	
            public void paintComponent(Graphics g) {

                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        
        btn1 = new Button("1인");
        btn2 = new Button("2인");
        
        Panel paButton = new Panel();

        paButton.add(btn1);
        paButton.add(btn2);
        paButton.setBounds(30, 30, 30, 30);
        
        add(paButton);
        
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
 
    public static void main(String[] args) {
       	Main frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}

	
