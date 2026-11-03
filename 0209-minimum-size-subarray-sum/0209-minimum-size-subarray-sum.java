class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minLen = Math.min(minLen,right-left+1);
                sum = sum-nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;




        //BRUTE FORCE

        // int minLen = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum >= target) {
        //             minLen = Math.min(minLen, j - i + 1);
        //         }
        //     }
        // }
        // return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}