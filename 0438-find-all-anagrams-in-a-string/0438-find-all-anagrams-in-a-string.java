class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pHash = new int[26];
        int[] sHash = new int[26];

        ArrayList<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        //count freq of string p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pHash[ch - 'a']++;
        }
        //count freq of string s of length p
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            sHash[ch - 'a']++;
        }
        //check first window
        if (Arrays.equals(pHash, sHash)) {
            ans.add(0);
        }

        int left = 0;
        int right = p.length();
        for (right = p.length(); right < s.length(); right++) {

            //remove outgoing char
            sHash[s.charAt(left) - 'a']--;
            //add incoming char
            sHash[s.charAt(right) - 'a']++;
            
            left++;

            if (Arrays.equals(pHash, sHash)) {
                ans.add(left);
            }

        }
        return ans;
    }
}