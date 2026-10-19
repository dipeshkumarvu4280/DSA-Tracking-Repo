class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;
        //transpose
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){//j+1-> i don't have to swap diagonal element
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }
//row wise reverse
       for(int i=0;i<n;i++){
        int st = 0;
        int end = n-1;
        while(st<end){
            int temp = matrix[i][st];
             matrix[i][st] = matrix[i][end];
             matrix[i][end] = temp;
            st++;
            end--;
        }
       }
    }
}