package bfs_dfs_pkg;

import java.util.LinkedList;

public class DFSearch {

	int no_of_ver;	// No. of vertices
	LinkedList<Integer> adj_list[];   //Adjacency Lists
	
	// Constructor
	@SuppressWarnings({ "unchecked", "rawtypes" })
	DFSearch(int no_of_ver) {

		this.no_of_ver = no_of_ver;
		adj_list = new LinkedList[no_of_ver];
		
		for(int i = 0;i < no_of_ver;i++) {
			
			adj_list[i] = new LinkedList();
			
		}
		
	}
	
	// Function to add an edge into the graph
	void addEdges(int b, int a) {
		
		adj_list[b].add(a);
		
	}
	
	
	void dfs_search(int root) {
		
		boolean checked[] = new boolean[no_of_ver];

		dfs_searchFunc(root, checked);
		
	}
	
	// DFS search function implementation
	void dfs_searchFunc(int root, boolean checked[]) {
		
		checked[root] = true;
		int temp = 0;

		System.out.println(root);
		
		for(int i = 0;i < adj_list[root].size();i++) {
			
			temp = adj_list[root].get(i);
			
			if(!checked[temp]) {
				dfs_searchFunc(temp, checked);
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		DFSearch ins = new DFSearch(7);
		
		ins.addEdges(0, 1);
		ins.addEdges(0, 3);
		ins.addEdges(1, 5);
		ins.addEdges(1, 2);
		ins.addEdges(1, 3);
		ins.addEdges(1, 6);
		ins.addEdges(3, 2);
		ins.addEdges(3, 4);
		ins.addEdges(4, 2);
		ins.addEdges(4, 6);
		
		System.out.println("DFS: ");
		
		ins.dfs_search(0);
		
	}

}
