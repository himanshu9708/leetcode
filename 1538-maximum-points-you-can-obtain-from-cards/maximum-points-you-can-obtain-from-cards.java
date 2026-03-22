class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int maxp = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        while (l < k) {
            maxp = Math.max(maxp, sum);
            sum = sum - nums[k - l - 1];
            sum = sum + nums[r];
            maxp = Math.max(maxp, sum);
            l = l + 1;
            r = r - 1;
        }
        return maxp;

    }
}