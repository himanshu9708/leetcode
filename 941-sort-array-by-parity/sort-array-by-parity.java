class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        int b = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[j] = nums[i];
                j++;
            } else {
                ans[b] = nums[i];
                b--;
            }
        }
        return ans;

    }
}