class Solution {
    public int removeDuplicates(int[] nums) {
        int n  =nums.length;
        int count = 0;
        int []ans = new int[n];
        int j = 0;
        for(int i = 1;i<n;i++){
            if(nums[i] != nums[i-1]){
                ans[j] = nums[i-1];
                j++;
                count++;
            }

        }
        ans[j] = nums[n-1];

        int k = 0;
        for(int i = 0;i<n;i++){
            nums[k] = ans[i];
            k++;
        }
        return count+1;


        
    }
}