class Solution {
    public boolean isVowels(char ch){
        return ch=='a'||ch=='e'||ch=='i'||
        ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
       int count = 0;
       int max = 0;
       for(int i = 0;i<k;i++){
            if(isVowels(s.charAt(i))){
            count++;
            }
       }
       max = count;
       for(int i = k;i<s.length();i++){
       if(isVowels(s.charAt(i-k))){
       count--;
    }
        if(isVowels(s.charAt(i))){
            count++;
         }
       max = Math.max(max,count);
        }
        return max;
    }
}