class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            p.add(i);
        }
        int h=0;
        for(int i=0;i<k;i++){
           h=p.poll();
        }
        return h;
        
    }
}