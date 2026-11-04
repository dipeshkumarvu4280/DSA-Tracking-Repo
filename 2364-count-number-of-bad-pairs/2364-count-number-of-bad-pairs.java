class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        long totalPairs =(long) n*(n-1)/2;
        long goodPairs = 0;
        for(int i = 0;i<nums.length;i++){
            int need = nums[i]-i;
            if(map.containsKey(need)){
                goodPairs += map.getOrDefault(need, 0);
            }
            map.put(need,map.getOrDefault(need,0)+1);
        }

        return totalPairs - goodPairs;//equal to bad pairs






        //BRUTE FORCE

        // long count = 0;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(i<j && j-i!=nums[j]-nums[i]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}