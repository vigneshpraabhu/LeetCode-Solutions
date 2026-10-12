class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->Integer.compare(x[1],y[1]));
        int p=intervals[0][1];
        int c=0;
        for(int i=1;i<intervals.length;i++){
            if(p==intervals[i][1]){
                c++;
            }
            else{
                p=intervals[i][1];
            }
        }
        return c;
        
    }
}