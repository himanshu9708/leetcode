class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        if (n < 2)
            return;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        return;
            }
        
        for (int i = n - 1; i > idx; i--) {
            if (nums[idx] < nums[i]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int start = idx + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}