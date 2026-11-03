class Solution {
    public int minMoves2(int[] nums) {
       int count = 0;
       Arrays.sort(nums);
       int median = nums[nums.length/2];
       for(int i = 0;i<nums.length;i++){
        if(nums[i]!=median){
            count+=Math.abs(nums[i]-median);
        }
       }
       return count;
    }
}