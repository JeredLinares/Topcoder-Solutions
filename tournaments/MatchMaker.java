import java.io.*;
import java.util.*;

public class MatchMaker {
	
	public MatchMaker(){
	}
	
	public Jdata formatInput(BufferedReader r){
			Cdata data = counter();
			
			int numNames = data.names;
			int numAns = data.answers;

//			System.out.println("lines:"+numNames);
//			System.out.println("answers:"+numAns);

			String[] names = new String[numNames];
			char[] gender = new char[numNames]; 
			char[] match = new char[numNames];
			char[][] letters = new char[numNames][numAns];
			
			try{
				for(int i = 0 ; i< numNames ; i++){
					Scanner scan = new Scanner(r.readLine());
					names[i] = scan.next();
//						System.out.println(names[i]);
					gender[i] = scan.next().charAt(0);
//						System.out.println(gender[i]);
					match[i] = scan.next().charAt(0);
//						System.out.println(match[i]);
					for(int j = 0 ; j < numAns ; j++){
						letters[i][j]=scan.next().charAt(0);
//							System.out.println(letters[i][j]);
					}
				}
			} catch (IOException e) {}

		return null;
	}
	
	public void runBest(){
try{
		BufferedReader reader = loadData();	
		int numLines = numLines();
		String[] lines = new String[numLines];
		
		for(int i = 0 ; i < lines.length ; i++){
			lines[i] = reader.readLine();
		}

		String[] results = getBestMatches(lines,"MARGE",4);

//		System.out.println("Matches");

		for(int i = 0 ; i < results.length ; i++){
			System.out.println(results[i]);
		}
}catch(IOException e){}

		
	}
	
	public BufferedReader loadData(){
		try{
			File file = new File("./MatchMaker.data");
			FileReader fReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fReader);
			return reader;	
		} catch(IOException e) {
			System.out.println("file not found");
		}
		
		return null; 

	}
	
	public int numLines(){
try{
		BufferedReader reader = loadData();
		int lines = 0 ;
		while(reader.ready()){
			lines++;
			reader.readLine();
		}
		return lines;
}catch(IOException e){}
		return 0;
	}	

	
	public Cdata counter(){
		BufferedReader r = loadData();
		String end = "";
		int lines = 0; 
		int answers = 0; 
	
		try{	
		while(r.ready()){
			lines++;
			Scanner scan = new Scanner(r.readLine());
			scan.next(); //name
			scan.next(); //gender
			scan.next(); //other gender
			end = scan.nextLine();
		}
		} catch(IOException e){ 
		}
		
		Scanner scan = new Scanner(end);
		while(scan.hasNext()){
			scan.next();
			answers++;
		}

		return new Cdata(lines,answers);
	}



	public String[] getBestMatches(String[] lines, String user, int sf) {
		int numNames = lines.length; 
		String[] names = new String[numNames];
		char[] gender = new char[numNames];
		char[] match = new char[numNames];
		int numAns = getNumAns(lines[1]);
		char[][] answers = new char[numNames][numAns];
		int lineNotToCount = 0; 
		String compareLine; 
		int[] score = new int[numNames]; 
		int meetCriteria = 0; 
		
		for(int i = 0 ; i < names.length ; i++){
			Scanner scan = new Scanner(lines[i]);
			String person = scan.next();
//			System.out.println(user.compareTo(person)+user+person);
			if(user.compareTo(person) == 0){
				lineNotToCount=i;
//				System.out.println("match: "+i);
			}
			names[i]=person;
			gender[i]=scan.next().charAt(0);
			match[i]=scan.next().charAt(0);
			for(int p = 0 ; p < numAns ; p++){
				answers[i][p]=scan.next().charAt(0);
			}
		}

		for(int i = 0 ; i < numNames ; i++){
			int tempScore = 0;
		 	for(int j = 0 ; j < numAns ; j++){
				if(answers[lineNotToCount][j] == answers[i][j]){
					tempScore++;
				}
			}
			score[i] = tempScore; 
			if(tempScore>=sf &&  match[lineNotToCount]==gender[i] ){
				meetCriteria++;
			}
//			System.out.println(names[i]+" "+tempScore);
		}
		
		int[][] tempMatrix = new int[meetCriteria][2];
		
		
		String[] result = new String[meetCriteria];
		int counter = 0; 
		for(int i = 0 ; i < numNames ; i++){
			if(score[i]>=sf && i!=lineNotToCount && match[lineNotToCount]==gender[i]){
				result[counter]=names[i];
				tempMatrix[counter][0]=i;
				tempMatrix[counter][1]=score[i];
				counter++;
			}
		}

		//sort result[] should use a better sort.

		for(int i = 0 ; i < result.length ; i++){
			for(int j = i+1 ; j < result.length ; j++){
				if(tempMatrix[i][1]<tempMatrix[j][1]){
					int t1 = tempMatrix[i][0]; 
					int t2 = tempMatrix[i][1];
					tempMatrix[i][0] = tempMatrix[j][0];
					tempMatrix[i][1] = tempMatrix[j][1];
					tempMatrix[j][0] = t1;
					tempMatrix[j][1] = t2; 
				}
			}
		}
		
		for(int i = 0 ; i<result.length;i++){
			result[i] = names[tempMatrix[i][0]];
		}


//		System.out.println("Selcted Person"+lineNotToCount);
		return result;
	}
	
	public int getNumAns(String line){
		Scanner scan = new Scanner(line);
		scan.next();	// name
		scan.next();	//gender
		scan.next();	//match
		int ans = 0; 
		
		while(scan.hasNext()){
			ans++;
			scan.next();
		}
		
		return ans;
	}

	private class Jdata{
		String[] names;
		char[] gender;
		char[] match; 
		char[][] answers;
		
		public Jdata(String[] n, char[] g, char[] m, char[][] a){
			names = n;
			gender = g; 
			match = m;
			answers = a;
		}
	}

	private class Cdata{
	int names = 0; 
	int answers = 0; 
	
	public Cdata(int lines, int ans){
		names = lines;
		answers = ans;	
	}

}

}
