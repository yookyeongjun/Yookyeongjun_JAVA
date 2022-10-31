package baseball;

public class UserCheck { 
	
	int strike; 
	int ball; 
	boolean out; 
	
	public UserCheck(int[] com, int[] user) { // Home팀, Away팀 입력값과 정답을 비교하는 메서드
		
		for(int i = 0; i<4 ; i++) {
			
			for(int j = 0; j<4 ; j++) {
				
				if(com[i] == user[j]) {
					
					if(i==j)
						strike++;
					else 
						ball++;
				} // strike와 ball의 개수를 숫자로 받아옴.
			}
		}
	}
	
	public int getStrike() {
		return strike;
	}
	
	public int getBall() {
		return ball;
	}
	
	public boolean getOut() { // strike와 ball이 모두 0이면 OUT
		
		if(strike == 0 && ball== 0)
			return true;
		else
			return false;
		
	}

}
