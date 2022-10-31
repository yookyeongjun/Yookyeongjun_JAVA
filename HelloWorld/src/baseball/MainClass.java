package baseball;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainClass extends JFrame implements ActionListener{
	
	MyPanel2 p;
	JTextField jtHome,jtAway;
	JButton jbHome,jbAway; 
	RNumHome rnh; 
	RNumAway rna;
	ImageIcon icon;
	
		public MainClass(RNumHome rnh,RNumAway rna){
		
		this.rnh = rnh;
		System.out.println("Home팀 정답 : " + rnh.getnumHome()[0]+""+rnh.getnumHome()[1]+""+rnh.getnumHome()[2]+""+rnh.getnumHome()[3]); 
		System.out.println("Away팀 정답 : " + rna.getnumAway()[0]+""+rna.getnumAway()[1]+""+rna.getnumAway()[2]+""+rna.getnumAway()[3]);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		icon = new ImageIcon("C:/Users/admin/git/Yookyeongjun_JAVA/HelloWorld/src/image/baseballpark.png");
		
		p = new MyPanel2() {
			public void paintComponent(Graphics g) {
                
                g.drawImage(icon.getImage(), 0, 0, null);
                
                setOpaque(false); 
                super.paintComponent(g);
            }
		}; 
		
		jtHome = new JTextField(30); 
		p.add(jtHome); 
		
		JButton jbHome = new JButton("Home 입력"); 
		jbHome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int[] userHome = new int[4]; 
				
				String[] tempHome = jtHome.getText().split(""); 
				
				
				for(int i=0 ; i < tempHome.length ; i++) {
					
					userHome[i] = Integer.parseInt(tempHome[i]);
					
				}
				
				UserCheckHome uh = new UserCheckHome(rna.getnumAway(), userHome);
				
				System.out.println("Home팀 : " + uh.getBall() + "-" + uh.getStrike());
				
				p.setData(uh.getStrike(), uh.getBall(), uh.getOut());
				
				p.repaint();
				
			}
			
		}); 
		jbHome.setFont(new Font("맑음고딕",Font.BOLD,18));
		p.add(jbHome); 
		
		jtAway = new JTextField(30);
		p.add(jtAway);

		JButton jbAway = new JButton("Away 입력"); 
		jbAway.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int[] userAway = new int[4]; 
				
				String[] tempAway = jtAway.getText().split(""); 
				
				
				for(int i=0 ; i < tempAway.length ; i++) {
					
					userAway[i] = Integer.parseInt(tempAway[i]);
					
				}
				
				UserCheckHome ua = new UserCheckHome(rnh.getnumHome(), userAway);
				
				System.out.println("Away팀 : " + ua.getStrike() + "-" + ua.getBall());
				
				p.setData(ua.getStrike(), ua.getBall(), ua.getOut());
				
				p.repaint();
				
			}
					
		});
		jbAway.setFont(new Font("맑음고딕",Font.BOLD,18));
		p.add(jbAway);
		
		c.add(p);
		
		setSize(600,400); 
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
	
	public static void main(String[] args) {
		
		new MainClass(new RNumHome(),new RNumAway());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

