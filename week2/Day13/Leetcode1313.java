class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int a[]=new int[size];
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            while(nums[i]>0){
                a[k++]=nums[i+1];
                nums[i]--;
            }
        }
        return a;
    }
}
