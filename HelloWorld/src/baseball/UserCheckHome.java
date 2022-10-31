package baseball;

public class UserCheckHome {
	
	int strike; 
	int ball; 
	boolean out; 
	
	public UserCheckHome(int[] com, int[] userHome) {
		
		for(int i = 0; i<4 ; i++) {
			
			for(int j = 0; j<4 ; j++) {
				
				if(com[i] == userHome[j]) {
					
					if(i==j)
						strike++;
					else 
						ball++;
				}
			}
		}
	}
	
	public int getStrike() {
		return strike;
	}
	
	public int getBall() {
		return ball;
	}
	
	public boolean getOut() {
		
		if(strike == 0 && ball== 0)
			return true;
		else
			return false; 
	}
	
	
}
