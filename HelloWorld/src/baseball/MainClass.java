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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass extends JFrame implements ActionListener{
	
	MyPanel p;
	JTextField jtHome,jtAway;
	JButton jbHome,jbAway; 
	RNumHome rnh; 
	RNumAway rna;
	ImageIcon icon;
	
		public MainClass(RNumHome rnh,RNumAway rna){
		
		this.rnh = rnh;
		this.rna = rna;
		System.out.println("Home팀 정답 : " + rnh.getnumHome()[0]+""+rnh.getnumHome()[1]+""+rnh.getnumHome()[2]+""+rnh.getnumHome()[3]); 
		System.out.println("Away팀 정답 : " + rna.getnumAway()[0]+""+rna.getnumAway()[1]+""+rna.getnumAway()[2]+""+rna.getnumAway()[3]);
		// Home팀, Away팀 정답 Console창에 출력
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		icon = new ImageIcon("C:/Users/admin/git/Yookyeongjun_JAVA/HelloWorld/src/image/baseballpark.jpg"); // 배경이미지
		
		p = new MyPanel() {
			
			public void paintComponent(Graphics g) {
                
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); 
                super.paintComponent(g);
            }
		}; 
		
		jtHome = new JTextField(30); // Home팀 입력창 
		p.add(jtHome); 
		
		JButton jbHome = new JButton("Home 입력"); // Home팀 입력 버튼
		jbHome.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int[] userHome = new int[4]; 
				String tempHome1 = jtHome.getText();
				String[] tempHome = jtHome.getText().split(""); 
				
				if(tempHome1.length() != 4) {
					
					JOptionPane.showMessageDialog(null,"4자리 숫자를 입력하세요.", "Home팀 반칙", JOptionPane.INFORMATION_MESSAGE); // 4자리가 아닌 입력값을 넣었을 경우
					
				} else if(tempHome[0].equals(tempHome[1]) || tempHome[0].equals(tempHome[2]) || tempHome[0].equals(tempHome[3]) || tempHome[1].equals(tempHome[2]) || tempHome[1].equals(tempHome[3]) || tempHome[2].equals(tempHome[3])){
					
					JOptionPane.showMessageDialog(null,"숫자 중복입력 불가능합니다.", "Home팀 반칙", JOptionPane.INFORMATION_MESSAGE); // 입력한 숫자에 중복이 있을 경우
					
				} else {
					
					for(int i=0 ; i < tempHome.length ; i++) { // 두가지 반칙 상황이 모두 없을 경우
						
						userHome[i] = Integer.parseInt(tempHome[i]);
						
					}
					
					UserCheck uh = new UserCheck(rna.getnumAway(), userHome); // Home팀의 입력값과 Away팀의 정답을 비교
					
					System.out.println("Home팀 : " + uh.getStrike() + "-" + uh.getBall());
					
					p.setData(uh.getStrike(), uh.getBall(), uh.getOut());
					
					p.repaint();
				
				}
			}
			
		}); 
		jbHome.setFont(new Font("맑음고딕",Font.BOLD,18));
		p.add(jbHome); 
		
		jtAway = new JTextField(30); // Away팀 입력창
		p.add(jtAway);

		JButton jbAway = new JButton("Away 입력"); // Away팀 입력버튼
		jbAway.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int[] userAway = new int[4]; 
				String tempAway1 = jtAway.getText();
				String[] tempAway = jtAway.getText().split(""); 
				
				if(tempAway1.length() != 4) {
					
					JOptionPane.showMessageDialog(null,"4자리 숫자를 입력하세요.", "Home팀 반칙", JOptionPane.INFORMATION_MESSAGE); // 4자리가 아닌 입력값을 넣었을 경우
					
				} else if(tempAway[0].equals(tempAway[1]) || tempAway[0].equals(tempAway[2]) || tempAway[0].equals(tempAway[3]) || tempAway[1].equals(tempAway[2]) || tempAway[1].equals(tempAway[3]) || tempAway[2].equals(tempAway[3])){
					
					JOptionPane.showMessageDialog(null,"숫자 중복입력 불가능합니다.", "Home팀 반칙", JOptionPane.INFORMATION_MESSAGE); // 입력한 숫자에 중복이 있을 경우
					
				} else {
					
					for(int i=0 ; i < tempAway.length ; i++) { // 두가지 반칙 상황이 모두 없을 경우
						
						userAway[i] = Integer.parseInt(tempAway[i]);
						
					}
					
					UserCheck ua = new UserCheck(rnh.getnumHome(), userAway); // Away팀의 입력값과 Home팀의 정답을 비교
					
					System.out.println("Away팀 : " + ua.getStrike() + "-" + ua.getBall());
					
					p.setData(ua.getStrike(), ua.getBall(), ua.getOut());
					
					p.repaint();
				}
			}
					
		});
		jbAway.setFont(new Font("맑음고딕",Font.BOLD,18));
		p.add(jbAway);
		
		c.add(p);
		
		setTitle("야구게임");
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

