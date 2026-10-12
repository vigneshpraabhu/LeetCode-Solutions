class Solution {
    int bnl(int[] nums, int target, int l, int r) {
    int o = -1;

    while (l <= r) {
        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            o = m;
            r = m - 1;
        }
        else if (nums[m] > target) {
            r = m - 1;
        }
        else {
            l = m + 1;
        }
    }

    return o;
}
int bnr(int[] nums, int target, int l, int r) {
    int o = -1;

    while (l <= r) {
        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            o = m;
            l= m + 1;
        }
        else if (nums[m] > target) {
            r = m - 1;
        }
        else {
            l = m + 1;
        }
    }

    return o;
}
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0,p=-1;
        int a[]=new int[2];
        Arrays.fill(a,-1);
        while(l<=r){
m=l+(r-l)/2;
if(nums[m]==target){
    a[0]=bnl(nums,target,l,m);
    a[1]=bnr(nums,target,m,r);
    return a;
    }
else if(nums[m]>target){
    r=m-1;
}
else{
    l=m+1;
}
        }
        return a;
        
    }
}