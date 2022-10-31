package baseball;

public class RNumAway {
	
	int numAway[]; // Away팀 정답 랜덤 생성
	
	public RNumAway() { 
		
		numAway = new int[4]; 
		
		numAway[0] =(int)(Math.random()*9+1); 
		
		numAway[1] =(int)(Math.random()*9+1);		
		while(numAway[0] == numAway[1]) {
			numAway[1] =(int)(Math.random()*9+1); 
		}
		
		numAway[2] =(int)(Math.random()*9+1);
		while(numAway[0] == numAway[2] || numAway[1] == numAway[2])
		{
			numAway[2] =(int)(Math.random()*9+1);
		}
		
		numAway[3] =(int)(Math.random()*9+1);
		while(numAway[0] == numAway[3] || numAway[1] == numAway[3] || numAway[2] == numAway[3])
		{
			numAway[3] =(int)(Math.random()*9+1);
		} // 각 자리의 숫자가 중복되는지 체크하는 과정
	}
	
	public int[] getnumAway() {
		return numAway;
	}
	
}

