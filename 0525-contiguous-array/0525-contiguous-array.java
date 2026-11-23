class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        
        for(int i = 0;i<nums.length;i++){//transforming array,if 0 then make it -1 and if 1 then +1
            if(nums[i]==0) nums[i] = -1;
            else nums[i] = 1;
        }
        int prefixSum = 0;
        int maxLen = 0;
        for(int i = 0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum)){
                int len = i-map.get(prefixSum);
            maxLen = Math.max(maxLen,len);
            }else{
                map.put(prefixSum,i);
            }
        }
        return maxLen;
    }
}