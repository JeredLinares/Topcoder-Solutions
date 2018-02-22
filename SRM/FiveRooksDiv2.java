

public class FiveRooksDiv2{

	public int findMax(String[] board){

		int lines = 8;
		int maxRows = 0; 
		int maxCols = 0; 

		//sum rows
		for(String row : board){
			int localRowMax = 0; 
			char[] chars = row.toCharArray();
			for(char square : chars){
				if(square == 'R'){
					localRowMax++;
				}
			}
			if(localRowMax > maxRows){
				maxRows = localRowMax; 
			}
		}

		char[][] allSquares = new char[8][8];
		
		for(int i = 0 ; i<8 ; i++){
			String theRow = board[i];
			char[] theLine = theRow.toCharArray();
			for(int j = 0 ; j < 8 ; j++){
				allSquares[i][j]=theLine[j];
			}
		}
		

		for(int i = 0 ; i<8 ; i++){
			int tempMax = 0;
			for (int j = 0 ; j<8 ; j++){
				if(allSquares[j][i] == 'R'){
					tempMax++;
				}
			}
			if(tempMax > maxCols){
				maxCols = tempMax;
			}
		}

		//compare rowMax and colMax
		if(maxRows > maxCols){
			return maxRows;
		}
		else{
			return maxCols;
		}
	}


}
