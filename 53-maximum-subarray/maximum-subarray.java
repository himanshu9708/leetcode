class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum < 0) {
                maxsum = Math.max(sum, maxsum);
                sum = 0;
            } else {
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;

    }
}