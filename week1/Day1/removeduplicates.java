class Solution {
    public int removeDuplicates(int[] nums) {
        int pre= 1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] != nums[i-1]) {
                nums[pre] = nums[i];
                pre++;
            }
        }
        return pre;
       
    }
}
