class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeroes = 0;
        int f = 0;
        // int second = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zeroes += 1;
            else if( nums[i] == 1)
                f += 1;
            // else second +=1;
        }
        for (int i = 0; i < zeroes; i++) {
                nums[i] = 0;
        }
        for(int i =  zeroes;i< zeroes+f ;i++){
            nums[i] = 1;
        }
        for(int i = zeroes +f;i<n;i++){
            nums[i] = 2;
        }

    }
}