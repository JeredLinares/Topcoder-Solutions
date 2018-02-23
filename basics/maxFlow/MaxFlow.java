import java.io.File;
import java.util.Scanner; 
import java.io.IOException;


public class MaxFlow{
	public MaxFlow(){
	}
	
	public static void main(String[] args){
		MaxFlow m = new MaxFlow();
		Node n = m.loadData();
	}

	public Node loadData(){
		Node source = new Node("Source");
		Scanner s = null; 
		String data = null; 
		try{
			File f = new File("flow.data");
			s = new Scanner(f);
			System.out.println(data = s.next());
		}catch(IOException e){
			System.err.println("Missing File");
		}

		String[] rawData = data.split("\\),\\(");
		
		for(int i = 0 ; i < rawData.length ; i++){
			rawData[i] = rawData[i].replaceAll("[\\(\\)]","");
			System.out.println(rawData[i]);
		}

		return new Node("Test");
	}


	private class Node{
		String name = null; 
		public Node(String s){
			name = s; 
		}
	}
}
