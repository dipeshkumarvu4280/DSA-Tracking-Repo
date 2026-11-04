class Solution {
    private static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nicePairs = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i < nums.length; i++) {
            int need = nums[i] - reverse(nums[i]);
            if (map.containsKey(need)) {
                nicePairs = (nicePairs + map.getOrDefault(need, 0)) % MOD;
            }
            map.put(need, map.getOrDefault(need, 0) + 1);
        }
        return nicePairs;
    }
}