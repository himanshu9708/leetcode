class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxidx = 0;

        for(int i = 0;i<n;i++){
      //maxidx = Math.max(maxidx,nums[i] + i);
            if(i > maxidx) return false;
            maxidx = Math.max(maxidx,nums[i] + i);
        }
        return true;
        
    }
}