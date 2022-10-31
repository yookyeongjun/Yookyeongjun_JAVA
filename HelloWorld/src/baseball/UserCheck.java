package baseball;

public class UserCheck { // 입력값과 정답을 비교
	
	int strike; 
	int ball; 
	boolean out; 
	
	public UserCheck(int[] com, int[] user) {
		
		for(int i = 0; i<4 ; i++) {
			
			for(int j = 0; j<4 ; j++) {
				
				if(com[i] == user[j]) {
					
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
