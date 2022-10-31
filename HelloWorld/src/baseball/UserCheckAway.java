package baseball;

public class UserCheckAway {
	
	int strike; 
	int ball; 
	boolean out; 
	
	public UserCheckAway(int[] com, int[] userAway) {
		
		for(int i = 0; i<4 ; i++) {
			
			for(int j = 0; j<4 ; j++) {
				
				if(com[i] == userAway[j]) {
					
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
