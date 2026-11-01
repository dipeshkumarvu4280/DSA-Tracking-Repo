class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];//find min element
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min) {
                count += nums[i] - min;
            }
        }
        return count;
    }
}