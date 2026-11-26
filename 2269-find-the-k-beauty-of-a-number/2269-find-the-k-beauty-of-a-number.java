class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        
        for(int i = 0;i<=s.length()-k;i++){
                int sub = Integer.parseInt(s.substring(i,i+k));
                if(sub!=0 && num % sub == 0){
                    count++;
                }
            }
        
        return count;
    }
}
