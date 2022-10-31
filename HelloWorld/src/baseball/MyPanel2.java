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
		g.drawString("-", 290, 180);
		
		if(strike == 4) {		
			
			g.setFont(new Font("맑음고딕",Font.BOLD,60));
			g.drawString("Home Run!!!!", 120, 210);
			
		}

		else {
			
			if(strike == 0) {

				g.setColor(Color.RED);
				g.drawString("0", 260, 180);
				g.drawString("S", 200, 222);
				g.drawOval(220,200,30,30);
	            g.drawOval(260,200,30,30);
	            g.drawOval(300,200,30,30);

	        } else if(strike == 1) {

	        	g.setColor(Color.RED);
	        	g.drawString("1", 260, 180);
	            g.drawString("S", 200, 222);
	            g.fillOval(220,200,30,30);
	            g.drawOval(260,200,30,30);
	            g.drawOval(300,200,30,30);

	        } else if(strike == 2) {

	        	g.setColor(Color.RED);
	        	g.drawString("2", 260, 180);
	            g.drawString("S", 200, 222);
	            g.fillOval(220,200,30,30);
	            g.fillOval(260,200,30,30);
	            g.drawOval(300,200,30,30);
	            
	        } else {

	        	g.setColor(Color.RED);
	        	g.drawString("3", 260, 180);
	            g.drawString("S", 200, 222);
	            g.fillOval(220,200,30,30);
	            g.fillOval(260,200,30,30);
	            g.fillOval(300,200,30,30);

	        }
			
			if(ball == 0) {
				
				g.setColor(Color.BLUE);
				g.drawString("0", 320, 180);
				g.drawString("B", 200, 262);
				g.drawOval(220,240,30,30);
				g.drawOval(260,240,30,30);
				g.drawOval(300,240,30,30);
				g.drawOval(340,240,30,30);
				
			} else if(ball == 1) {
				
				g.setColor(Color.BLUE);
				g.drawString("1", 320, 180);
				g.drawString("B", 200, 262);
				g.fillOval(220,240,30,30);
				g.drawOval(260,240,30,30);
				g.drawOval(300,240,30,30);
				g.drawOval(340,240,30,30);
				
			} else if(ball == 2) {
				
				g.setColor(Color.BLUE);
				g.drawString("2", 320, 180);
				g.drawString("B", 200, 262);
				g.fillOval(220,240,30,30);
				g.fillOval(260,240,30,30);
				g.drawOval(300,240,30,30);
				g.drawOval(340,240,30,30);
				
			} else if(ball == 3) {
				
				g.setColor(Color.BLUE);
				g.drawString("3", 320, 180);
				g.drawString("B", 200, 262);
				g.fillOval(220,240,30,30);
				g.fillOval(260,240,30,30);
				g.fillOval(300,240,30,30);
				g.drawOval(340,240,30,30);
				
			} else {
				
				g.setColor(Color.BLUE);
				g.drawString("4", 320, 180);
				g.drawString("B", 200, 262);
				g.fillOval(220,240,30,30);
				g.fillOval(260,240,30,30);
				g.fillOval(300,240,30,30);
				g.fillOval(340,240,30,30);
	            
			}
			
			if(!out) {
				
				g.setColor(Color.ORANGE);
				g.drawString("O", 200, 302);
	            g.drawOval(220,280,30,30);
			
			} else {
				
				g.setColor(Color.ORANGE);
				g.drawString("O", 30, 302);
	            g.fillOval(220,280,30,30);
	            
			}
			
		}
		
	}
	
}
