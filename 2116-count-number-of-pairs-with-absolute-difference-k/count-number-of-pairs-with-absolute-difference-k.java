class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Check if nums[i] + k already appeared
            res += map.getOrDefault(nums[i] + k, 0);

            // Check if nums[i] - k already appeared
            res += map.getOrDefault(nums[i] - k, 0);

            // Store current number frequency
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return res;
    }
}
