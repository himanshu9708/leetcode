class Solution {
    public void rotate(int[] nums, int r) {
        int n = nums.length;
        int k = 0;
        if (n < r) {
            if (r % n == 0)
                return;
            else
                k = (r - n) % n;
        }
        if (n > r)
            k = r;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
        int idx = k;
        for (int i = 0; i < (n - k) / 2; i++) {
            int temp = nums[idx];
            nums[idx] = nums[n - i - 1];
            nums[n - i - 1] = temp;
            idx++;
        }

    }
}