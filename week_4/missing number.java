class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int nsum=n*(n+1)/2,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return nsum-sum;
    }
}
