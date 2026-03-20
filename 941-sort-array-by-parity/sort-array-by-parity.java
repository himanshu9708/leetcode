class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 0;

        while (j < n) {
            if ((nums[j] % 2) == 0) {
                j++;
                i = j + 1;
            } else {
                while (i < n) {
                    if ((nums[i] % 2) == 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                    i++;
                }
                if (i >= n-1)
                    return nums;
            }

        }
        return nums;
    }
}
