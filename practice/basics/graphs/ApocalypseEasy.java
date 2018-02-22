
public class ApocalypseEasy{

	public ApocalypseEasy(){
			//for(int p = 0 ; p < s.length ; p++){
		//	System.out.println(s[p]);			//for debugging shows what is loaded from test case
		//}
	}

	public static void main(String[] args){
		if(args == null){
			System.out.println("Missing args");
			return;
		}else{
			if(args.length < 1){
					System.out.println("Missing test case name");
				return;
			}
		}
		
		ApocalypseEasy e = new ApocalypseEasy();
		TestCaseReader r = new TestCaseReader();
		String[] s = r.loadData(Integer.parseInt(args[0]));
		if(s ==null){
			System.out.println("No such file");
			return;
		}
		String[] graph = s[0].split(",");
		String[] tokens = s[1].split(",");
		int turns = Integer.parseInt(s[2]);
		
		/** For debugging show data in arrays
		for(int i = 0 ; i <graph.length ; i++){
			System.out.print(graph[i]);
		}
		System.out.println();
		for (int i = 0 ; i<tokens.length ; i++){
			System.out.print(tokens[i]);
		}
		System.out.println();
		***/

		int maxPossible = graph.length + 1 - tokens.length; 

		int[][] graphMatrix = new int[graph.length+1][graph.length+1];
		
		
		System.out.println("maxPossible:"+maxPossible); 	//for debuging show max possible 
	}
}
