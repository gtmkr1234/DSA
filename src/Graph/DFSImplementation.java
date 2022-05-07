package Graph;

import java.util.ArrayList;

public class DFSImplementation {
    public static ArrayList<Integer> dfsofGraph(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> storedfs = new ArrayList<>();
        boolean []vis = new boolean[v+1];
        for (int i = 1; i <=v ; i++) {
            if(vis[i]==false){
                dfs(i,vis,adj,storedfs);
            }
        }
        return storedfs;
    }
    public static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storedfs){
        storedfs.add(node);
        vis[node] = true;
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,storedfs);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 1; i <=7 ; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);


        adj.get(5).add(6);
        adj.get(6).add(5);
        System.out.println(dfsofGraph(6,adj));
    }
}
