class Solution {
    public boolean canJump(int[] nums) {
       if(nums.length==1){
        return true;
       }
        int g=nums.length;
       for (int i=g-1;i>=0;i--){
        if(nums[i]+i>=g){
            g--;
        }
       }
       return g==0; 
    }
}