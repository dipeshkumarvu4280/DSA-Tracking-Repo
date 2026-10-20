class Solution {
    public int heightChecker(int[] heights) {
        int []arr = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i<heights.length&&j<arr.length){
            if(arr[i]!=heights[j]){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}