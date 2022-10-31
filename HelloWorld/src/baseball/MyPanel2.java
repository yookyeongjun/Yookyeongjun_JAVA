package baseball;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel2 extends JPanel{

	JTextField jt;

	int strike = 0; 
	int ball = 0;
	boolean out = false; 

	void setData(int strike, int ball, boolean out) {

		this.strike = strike; 
		this.ball = ball; 
		this.out = out;
		
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g); 

		g.setFont(new Font("맑음고딕",Font.BOLD,20)); 
		g.drawString("-", 190, 100);
		
		if(strike == 4) {		
			
			g.setFont(new Font("맑음고딕",Font.BOLD,60));
			g.drawString("Home Run!!!!", 30, 180);
			
		}

		else {
			
			if(strike == 0) {

				g.setColor(Color.RED);
				g.drawString("0", 160, 100);
				g.drawString("S", 30, 222);
				g.drawOval(50,200,30,30);
	            g.drawOval(90,200,30,30);
	            g.drawOval(130,200,30,30);

	        } else if(strike == 1) {

	        	g.setColor(Color.RED);
	        	g.drawString("1", 160, 100);
	            g.drawString("S", 30, 222);
	            g.fillOval(50,200,30,30);
	            g.drawOval(90,200,30,30);
	            g.drawOval(130,200,30,30);

	        } else if(strike == 2) {

	        	g.setColor(Color.RED);
	        	g.drawString("2", 160, 100);
	            g.drawString("S", 30, 222);
	            g.fillOval(50,200,30,30);
	            g.fillOval(90,200,30,30);
	            g.drawOval(130,200,30,30);
	            
	        } else {

	        	g.setColor(Color.RED);
	        	g.drawString("3", 160, 100);
	            g.drawString("S", 30, 222);
	            g.fillOval(50,200,30,30);
	            g.fillOval(90,200,30,30);
	            g.fillOval(130,200,30,30);

	        }
			
			if(ball == 0) {
				
				g.setColor(Color.BLUE);
				g.drawString("0", 220, 100);
				g.drawString("B", 30, 262);
				g.drawOval(50,240,30,30);
				g.drawOval(90,240,30,30);
				g.drawOval(130,240,30,30);
				g.drawOval(170,240,30,30);
				
			} else if(ball == 1) {
				
				g.setColor(Color.BLUE);
				g.drawString("1", 220, 100);
				g.drawString("B", 30, 262);
				g.fillOval(50,240,30,30);
				g.drawOval(90,240,30,30);
	            g.drawOval(130,240,30,30);
				g.drawOval(170,240,30,30);
				
			} else if(ball == 2) {
				
				g.setColor(Color.BLUE);
				g.drawString("2", 220, 100);
				g.drawString("B", 30, 262);
				g.fillOval(50,240,30,30);
				g.fillOval(90,240,30,30);
				g.drawOval(130,240,30,30);
				g.drawOval(170,240,30,30);
				
			} else if(ball == 3) {
				
				g.setColor(Color.BLUE);
				g.drawString("3", 220, 100);
				g.drawString("B", 30, 262);
				g.fillOval(50,240,30,30);
				g.fillOval(90,240,30,30);
				g.fillOval(130,240,30,30);
				g.drawOval(170,240,30,30);
				
			} else {
				
				g.setColor(Color.BLUE);
				g.drawString("4", 220, 100);
				g.drawString("B", 30, 262);
	            g.fillOval(50,240,30,30);
	            g.fillOval(90,240,30,30);
	            g.fillOval(130,240,30,30);
	            g.fillOval(170,240,30,30);
	            
			}
			
			if(!out) {
				
				g.setColor(Color.ORANGE);
				g.drawString("O", 30, 302);
	            g.drawOval(50,280,30,30);
			
			} else {
				
				g.setColor(Color.ORANGE);
				g.drawString("O", 30, 302);
	            g.fillOval(50,280,30,30);
	            
			}
			
		}
		
	}
	
}
