class Solution {
    public int minMoves2(int[] nums) {
       int count = 0;
       Arrays.sort(nums);
       int left = 0;
       int right = nums.length-1;
       int median = nums[left+(right-left)/2];
       for(int i = 0;i<nums.length;i++){
        if(nums[i]!=median){
            count+=Math.abs(nums[i]-median);
        }
       }
       return count;
    }
}