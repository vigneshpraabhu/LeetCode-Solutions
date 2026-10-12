class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                int lo=m;
                int k=m,n=m;
                while(lo-1>=0&&nums[lo]==target){
                   if(nums[lo-1]==target){
                    k--;
                   }
                   lo--;
                }
                int hi=m;
                while(hi+1<nums.length&&nums[hi]==target){
                    if(nums[hi+1]==target){
                        n++;
                    }
                    hi++;
                   
                }
                return new int[]{k,n};

            }
            else if(nums[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return new int[]{-1,-1};
        
    }
}