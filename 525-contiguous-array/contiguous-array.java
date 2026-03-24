class Solution {
    public int findMaxLength(int[] nums) {
        int n= nums.length;
        int sum = 0;
        int maxl = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else{
                sum +=nums[i];
            }
            if(sum == 0){
                maxl = Math.max(maxl,i-map.get(sum)+1);
            }
                if(map.containsKey(sum)){
                    maxl = Math.max(maxl,i-map.get(sum));
                }
                map.put(sum,map.getOrDefault(sum,i));

            }
            return maxl;
        }
        
    }
