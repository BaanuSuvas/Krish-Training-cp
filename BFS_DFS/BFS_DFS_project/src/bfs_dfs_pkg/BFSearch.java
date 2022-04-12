package bfs_dfs_pkg;

import java.util.LinkedList;
import java.util.Queue;

//This class represents a directed graph using adjacency list representation

public class BFSearch {

	int no_of_ver;  // No. of vertices
	LinkedList<Integer> adj_list[];	//Adjacency Lists
	
	
	// Constructor
	@SuppressWarnings({ "unchecked", "rawtypes" })
	BFSearch(int no_of_ver) {

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

	
	// BFS search function implementation
	void bfs_search(int root) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean checked[] = new boolean[no_of_ver];
		
		checked[root] = true;	
		int temp = 0;
		
		queue.add(root);
		
		while(queue.size() != 0) {
			
			root = queue.poll();
			
			System.out.println(root);
			
			for(int i = 0;i < adj_list[root].size();i++) {
				
				temp = adj_list[root].get(i);
				
				
				if(!checked[temp]) {
					
					checked[temp] = true;
					queue.add(temp);
					
				}
				
			}
			
		}
		
	}


	public static void main(String[] args) {
		
		BFSearch ins = new BFSearch(7);
		
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
		
		System.out.println("BFS: ");
		
		ins.bfs_search(0);


	}

}
