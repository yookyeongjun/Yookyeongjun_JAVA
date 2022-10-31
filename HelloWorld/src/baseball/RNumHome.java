package baseball;

class RNumHome {
	
	int numHome[];
	
	public RNumHome() { 
		
		numHome = new int[4]; 
		
		numHome[0] =(int)(Math.random()*9+1);
		
		numHome[1] =(int)(Math.random()*9+1);		
		while(numHome[0] == numHome[1]) {
			numHome[1] =(int)(Math.random()*9+1); 
		}
		
		numHome[2] =(int)(Math.random()*9+1);
		while(numHome[0] == numHome[2] || numHome[1] == numHome[2])
		{
			numHome[2] =(int)(Math.random()*9+1);
		}
		
		numHome[3] =(int)(Math.random()*9+1);
		while(numHome[0] == numHome[3] || numHome[1] == numHome[3] || numHome[2] == numHome[3])
		{
			numHome[3] =(int)(Math.random()*9+1);
		}
	}
	
	public int[] getnumHome() {
		return numHome;
	}
	
}

