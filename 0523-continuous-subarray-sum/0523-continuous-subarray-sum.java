class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int need = (k == 0) ? prefixSum : prefixSum % k;

            if (map.containsKey(need)) {
                if (i - map.get(need) >= 2) {//length>=2
                    return true;

                }
            } else {
                map.put(need, i);
            }
        }
        return false;

        //BRUTE FORCE

        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (j>i && k == 0 && sum == 0) {
        //             return true;
        //         }
        //         if (j > i && k!= 0 && sum % k == 0) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}