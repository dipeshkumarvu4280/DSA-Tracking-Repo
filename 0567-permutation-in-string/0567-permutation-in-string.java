class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Hash = new int[26];
        int[] s2Hash = new int[26];

        
        if (s1.length() > s2.length()) {
            return false;
        }
        //count freq of string s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1Hash[ch - 'a']++;
        }
        //count freq of first window in string s2
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            s2Hash[ch - 'a']++;
        }
        //check first window
        if (Arrays.equals(s1Hash, s2Hash)) {
            return true;
        }

        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {

            //remove outgoing char
            s2Hash[s2.charAt(left) - 'a']--;
            //add incoming char
            s2Hash[s2.charAt(right) - 'a']++;
            
            left++;

            if (Arrays.equals(s1Hash, s2Hash)) {
                return true;
            }

        }
        return false;
    }
}