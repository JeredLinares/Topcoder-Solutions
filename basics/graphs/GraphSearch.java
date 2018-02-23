import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GraphSearch{

	public GraphSearch(){
		
	}
	
	public static void main(String[] args){
		GraphSearch g = new GraphSearch();
		Node n = g.loadGraph();
		if(args.length > 0 ){
			switch(args[0]){
				case "bfs": 
					System.out.println("Searching Graph via BFS");
					g.bfs(n);
					break;
				case "dfs":
					System.out.println("Searching Graph via DFS");
					g.dfs(n);
					break;
				default: 
					System.out.println("Please try another name for search");
					break;
			}
		}else{ System.out.println("Please enter a search");}
	}
	
	public void bfs(Node n){
		if(n!=null){
			System.out.println("head:"+n.getName());
			Queue<Node> q = new LinkedList<Node>();
			n.setVisited();
			q.add(n);
			while(!q.isEmpty()){
				Node r = q.remove();
				int numKids = r.getKids().size();
				for(int p = 0 ; p < numKids ; p ++){
					if(!r.getKids().get(p).isVisited()){
						q.add(r.getKids().get(p));
						r.getKids().get(p).setVisited();
					}
				}
				System.out.println(r.getName());
			}
		}else{ System.out.println("Empty Graph");}
	}

	public void dfs(Node n){
		if(n.getKids()==null)
			return;
		System.out.println(n.getName());
		n.setVisited();
		for(int i = 0 ; i < n.getKids().size() ; i++){
			if(!n.getKids().get(i).isVisited()){
				n.getKids().get(i).setVisited();
				dfs((Node)n.getKids().get(i));
			}
		}
	}

	public Node loadGraph(){
	
		Node[] graph = null;
		Scanner s = null; 
		try{
			File f = new File("graphs.data");
			s = new Scanner(f);
		} catch(IOException e){
			System.out.println("could not load data");
			return null;
		}
		
		if(s.hasNext()){
			String data = s.next();
			
			String[] nodes = data.split("\\),\\(");
			for(int i = 0 ; i < nodes.length ; i++){
				nodes[i]=nodes[i].replaceAll("[\\(\\)]","");
			}
			
			graph = new Node[nodes.length];
			for(int i = 0 ; i < nodes.length ; i++){
				graph[i] = new Node(i+1);
//				System.out.println(i+1);
			}
	//		System.out.println("line");
			for(int i = 0 ; i < nodes.length ; i++){
				String[] p = nodes[i].split(",");
				for(String str : p ){
	//				System.out.println(Integer.parseInt(str));
					graph[i].addKid(graph[Integer.parseInt(str)-1]);
				}
			}
			
			return graph[0];
		} else{
			System.out.println("Empty Graph");
			return null;
		}
	}
	
	
	private class Node{
		int name; 
		boolean visited = false; 
		ArrayList<Node> kids = new ArrayList<Node>();
		public Node(int i){
			name = i; 
		}
		public void addKid(Node kid){
			kids.add(kid); 
		}
		public ArrayList<Node> getKids(){
			return kids;
		}
		public void setVisited(){
			visited = true; 
		}
		public boolean isVisited(){
			return visited; 
		}
		public int getName(){
			return name;
		}
	}
}
