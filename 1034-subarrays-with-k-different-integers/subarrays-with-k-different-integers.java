class Solution {
    public int subwithdistk(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int c = 0;
        while (r < n) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                int ch = nums[l];
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                l++;
            }
            c += r - l + 1;
            r++;

        }
        return c;

    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return subwithdistk(nums, k) - subwithdistk(nums, k - 1);

    }
}
