class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int write = 0;

        while(i<chars.length){
            int count = 0;

            //counting consecutive same characters
            while(j<chars.length &&chars[j]==chars[i]){
                count++;
                j++;
            }
                chars[write] = chars[i];
                write++;
                if(count>1){
                    String num = String.valueOf(count);
                    //if  num>9 greater than 9 means if it is 12 then 1 and 2 will be two strings
                    for (int k = 0; k < num.length(); k++) {
                        chars[write] = num.charAt(k);
                            write++;
                    }
                }
                //go to next group
                i = j;

        }
        return write;
        
    }
}
