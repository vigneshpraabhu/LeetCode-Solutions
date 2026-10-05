import java.util.Arrays;
class Solution {
   
    static void dfs(int n, ArrayList<ArrayList<Integer>> a,boolean v[]){
        v[n]=true;
        for(int i:a.get(n)){
            if(!v[i]){
               
                dfs(i,a,v);
            }
        }
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            a.get(edges[i][0]).add(edges[i][1]);
            a.get(edges[i][1]).add(edges[i][0]);
           
        }
        boolean v[]=new boolean[n];
        dfs(source,a,v);
        return v[destination];
        }
}