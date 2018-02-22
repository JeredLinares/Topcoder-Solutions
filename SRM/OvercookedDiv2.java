public class OvercookedDiv2{

	public int minStale(int[] start, int[] time){
		int waitTime = 0; 
		int timer = 0; 
		

		for(int i = 0 ; i<start.length ; i++){
			int curWait = 0; 
			if(start[i]>timer){
				curWait = start[i] - timer; 
				waitTime += curWait;
			}
			timer = timer + time[i] + curWait;
		}

		if(waitTime==0)
			return 1;
		else
			return waitTime;
	}

}
