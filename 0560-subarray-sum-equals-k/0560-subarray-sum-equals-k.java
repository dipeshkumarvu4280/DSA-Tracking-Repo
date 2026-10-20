class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefixSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            prefixSum+=nums[i];

            int need = prefixSum-k;

            if(map.containsKey(need)){
                count+=map.get(need);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}

        //BRUTE FORCE

//         int count = 0;
//         for(int i = 0;i<nums.length;i++){
//             int sum = 0;
//             for(int j = i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum==k){
//                     count++;
//                 }
//             }
//         }
//         return count;

//     }
// }