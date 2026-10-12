class Solution {
    public boolean canJump(int[] nums) {
       
        int g=nums.length,k=0;
       for (int i=g-1;i>=0;i--){
        if(nums[i]+i>=g){
            g--;
        }
       }
       return g==0; 
    }
}