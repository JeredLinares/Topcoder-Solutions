import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class TestCaseReader{

	//constructor	
	public TestCaseReader(){
		
	}
	
	//load data from test case	
	public String[] loadData(int i){
		String[] data = null;
		Scanner s = null; 
		
		// load data file	
		try{
			File f = new File("tests/"+i+".data");
			s = new Scanner(f);
		}catch(IOException e){
			System.out.println("No file");
			return null;
		}
		
		//clean data from file
			//format {3,4,6,7}
			//		 {3,45}
			//		 5
		data = new String[3];
		for(int j = 0 ; j<3 ; j++){
			
			String line = s.next();
			data[j]=line.replaceAll("[\\{\\}]","");
		}

		/**
			//Other formats of data
		**/
		
		
		//return result
		return data;
	}

}
