import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class SearchGraph {
	Node[] graph = null;
	
	public static void main(String arg[]){
		
		if(arg.length==0){
			System.out.println("Which search?");
			return;
		}
		
		SearchGraph g = new SearchGraph();
		switch(arg[0]){
			case "bfs": g.bfs(g.getFirstNode());
				break;
			default:
				System.out.println("Try again");
				break;
		}

	}
		
	public SearchGraph(){
		graph = loadGraph();
	}

	public Node getFirstNode(){
		return graph[0];
	}

	public void bfs(Node n){
//		System.out.println("Starting with: "+n.getName());
		Node aNode = null;
		if(n==null){
			System.out.println("No elements");
		}else{
			Queue<Node> q = new LinkedList<Node>();
			q.add(n);
			while(!q.isEmpty()){
				aNode = q.remove();
				System.out.println(aNode.getName());
				graph[aNode.getName()-1].setVisited();
				ArrayList<Node> nArr = graph[aNode.getName()-1].getKids();
				for(int u = 0 ; u < nArr.size() ; u++){
					//System.out.println("children"+nArr.get(u).getName());
					if(!graph[nArr.get(u).getName()-1].isVisited()){
						q.add(graph[nArr.get(u).getName()-1]);
						graph[nArr.get(u).getName()-1].setVisited();
					}
				}
			}
		}
	}

	public Node[] loadGraph(){
		Node[] graph = null;

		try{
			int nodes = 0; 
			Scanner scan = new Scanner(new File("graphs.data"));
			String input = scan.next();
			String i = "\\Q),(\\E";
			String[] array = input.split(i);
			nodes = array.length;
			graph = new Node[nodes];
			
			for(int p = 0 ; p < array.length ; p++){
				String s = array[p];
				array[p]=s.replaceAll("[\\(\\)]","");
				graph[p] = new Node(p+1);
			}
			

			for(int j = 0 ; j<nodes ; j++){
				String[] vertex = array[j].split(",");
				ArrayList<Node> connections = new ArrayList<Node>();
				for(String s : vertex){
					connections.add(graph[new Integer(s).intValue()-1]);
				}
				graph[j].setKids(connections);
			}

		}
		catch(IOException e){
			System.err.println("missing file");
		}
		
		return graph;
	}

	
	private class Node{
	
		private int nodeNumber;
		private ArrayList<Node> children = null;
		private boolean checked = false;

		public Node(int w){
			nodeNumber = w;
		}
		public void setNumber(int i){
			nodeNumber=i;
		}
		public void setKids(ArrayList<Node> k){
			children = k; 
		}
		public ArrayList<Node> getKids(){
			return children;
		}
		public void setVisited(){
			checked=true;
		}
		public boolean isVisited(){
			return checked;
		}
		public int getName(){
			return nodeNumber;
		}
	}
}

