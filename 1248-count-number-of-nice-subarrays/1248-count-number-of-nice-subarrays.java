class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int totalCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2!=0){    
            prefixSum++;
            }
            int need = prefixSum-k;
            if(map.containsKey(need)){
                totalCount+=map.get(need);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
            
        }
        return totalCount;
    }
}



// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         return atMost(nums, k) - atMost(nums, k - 1);
//     }

//     private int atMost(int[] nums, int k) {
//         if (k < 0) return 0;

//         int left = 0;
//         int oddCount = 0;
//         int count = 0;

//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] % 2 != 0) {
//                 oddCount++;
//             }

//             while (oddCount > k) {
//                 if (nums[left] % 2 != 0) {
//                     oddCount--;
//                 }
//                 left++;
//             }

//             count += right - left + 1;
//         }

//         return count;
//     }
// }
