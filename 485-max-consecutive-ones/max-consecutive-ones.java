class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int r = 0;
        int count = 0;
        int maxc = 0;
        while(r<n){
            if(nums[r] == 1){
                count++;
            }
            else{
                maxc = Math.max(maxc,count);
                count = 0;
            }
            r++;
        }
        return Math.max(maxc,count);
        
    }
}