class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int st=0,to=0,j=0;
        for(int i=0;i<gas.length;i++){
            to+=gas[i]-cost[i];
            j+=gas[i]-cost[i];
            if(j<0){
                st=i+1;
                j=0;
            }

        }
        if(to<0){
            return -1;
        }
        return st;
        
    }
}