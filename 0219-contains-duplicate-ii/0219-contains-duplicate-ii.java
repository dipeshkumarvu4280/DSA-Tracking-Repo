class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            //keeping only previous k elements in set
            if(i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;

        //BRUTE FORCE
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[j]==nums[i]&& Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}