package baseball;

public class RNumAway {
	
	int numAway[];
	
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
		}
	}
	
	public int[] getnumAway() {
		return numAway;
	}
	
}

