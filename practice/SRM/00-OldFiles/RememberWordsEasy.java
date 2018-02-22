public class RememberWordsEasy{
	public String isPossible(int d1, int d2, int w1, int w2){
		int[] wordsS2 = new int[d2];
		double avg1 = w1/d1;
		double avg2 = w2/d2;
		// (avg1 +/- d1/2 +/- 1 = avg2 +/- d2/2
		int minW1 = (int)(avg2 - d2/2 - 1 - d1/2)*d1;
		int maxW1 = (int)(avg2 + d2/2 + 1 + d2/2)*d1;
		int minW2 = (int)(avg1 - d1/2 - 1 - d2/2)*d2;
		// Avg1 and Avg2 <= 1
		if(avg1 <= 1 && avg2 <= 1){
			return "Possible";
		}
		// Avg1 <= 1 and Avg2 > 1
		else if( avg1 <= 1 && avg2 > 1){
			if( w1 < minW1){
				return "Possible";
			} else{	return "Impossible";}
		}
		// Avg1 and Avg2 >1
		else if( avg1 >1 && avg2 >1){
			if( w1 > minW1 && w1 < maxW1){
				return "Possible";
			} else{
				return "Impossible";
			}
		}
		// Avg1 > 1 and Avg2 <= 1
		else if( avg1 >1 && avg2 <= 1){
			if(minW2 > w2){
				return "Possible";
			} else{
				return "Impossible";
			}
		}
		return "test";
	}
}
