class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if((0<=m-1)&&(nums[m-1]==target)){
                return m-1;
            }
            else if(m+1<nums.length&&nums[m+1]==target){
                return m+1;
            }
            else if(nums[m]==target-1){
                return m+1;
            }
            else if(nums[m]==target+1){
                return m;
            }
            else if(nums[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return 0;
    }
}