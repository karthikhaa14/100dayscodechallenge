class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;
        return nums[len-k];
    }
}
