package Depth_First_Search;
import java.util.LinkedList;
import java.util.Stack;


public class Depth_First_Search {

    private LinkedList<Integer> adj[];
    private int V;

    Depth_First_Search(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0 ; i < V; i++)
            adj[i] = new LinkedList<>();
    }


    void addedge(int i, int j){
        adj[i].add(j);

    }

    void dfs(int s){
        boolean Visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(s);

        while(!stack.empty()){
            int n = stack.pop();
            if(!Visited[n]){
                Visited[n] = true;
                System.out.println( n + " ");
                for (int i : adj[n]){
                    if (!Visited[i]){
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Depth_First_Search Dfs = new Depth_First_Search(4);

        Dfs.addedge(0,1);
        Dfs.addedge(0,2);
        Dfs.addedge(1,2);
        Dfs.addedge(2,3);
        Dfs.addedge(3,3);

        Dfs.dfs(0);

    }

}
