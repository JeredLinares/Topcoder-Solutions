import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class GraphSearchMatrix{

	public GraphSearchMatrix(){

	}

	public static void main(String[] args){
		Scanner s = null;

		try{
		File f = new File("graphs.data");
		s = new Scanner(f);
		}catch(IOException e){}

		String str = s.next();

		String[] data = str.split("\\),\\(");
		for(int i = 0 ; i<data.length ; i++){
			data[i] = data[i].replaceAll("[\\(\\)]","");
		}
		/**
		for(int i = 0 ; i<data.length ; i++){
			System.out.println(data[i]);
		}
		**/

		//load up the matrix
		int[][] matrix = new int[data.length][data.length];
		for(int i = 0 ; i < data.length ; i++){
			String[] edges = data[i].split(",");
			
			for(int j = 0 ; j < edges.length ; j++){
				matrix[i][Integer.parseInt(edges[j])-1]=1;
			}
		}

		//DFS of matrix

		GraphSearchMatrix mat = new GraphSearchMatrix();
		int visited[] = new int[matrix.length];
		for(int j = 0 ; j<matrix.length ; j++){
			visited[j]=0;
		}
		int start = 0; 
		mat.dfs(matrix,visited,start);
		

	}

	public void dfs(int[][] m, int[] visited, int start){
			visited[start]=1;
			for(int i = 0 ; i < visited.length ; i++){
				if(m[start][i]==1 && visited[i]!=1){
					visited[i]=1;
					dfs(m,visited,i);
				}
			}
			System.out.println(start+1);
	}

}
