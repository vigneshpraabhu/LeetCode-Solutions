class Solution {
    void df(int i,boolean v[],int [][]b){
        v[i]=true;
        for(int j=0;j<b.length;j++){
            if(!v[j]&&b[i][j]!=0){
                df(j,v,b);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
       boolean v[]=new boolean [isConnected.length];
       int c=0;
       for(int i=0;i<isConnected.length;i++){
        if(!v[i]){
c++;
df(i,v,isConnected);
        }

       }
       return c;

        
    }
}