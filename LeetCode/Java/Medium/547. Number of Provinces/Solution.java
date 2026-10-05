class Solution {
    int []pa;
    int fi(int x){
        if(pa[x]==x){
            return x;
        }
        return pa[x]=fi(pa[x]);
    }
    void un(int a,int b){
        int ph=fi(a);
        int pb=fi(b);
        if(ph==pb){
            return;
        }
        pa[pb]=ph;
    }
    public int findCircleNum(int[][] isConnected) {
        pa=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            pa[i]=i;
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    un(i,j);
                }
            }
        }
        Set<Integer> set = new HashSet<>();

for(int i = 0; i <isConnected.length ; i++) {
    set.add(fi(i));
}

return set.size();

        
    }
}