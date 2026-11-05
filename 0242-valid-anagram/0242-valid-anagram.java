class Solution {
    public boolean isAnagram(String s, String t) {

        int[] sHash = new int[26];
        int[] tHash = new int[26];

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sHash[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tHash[ch - 'a']++;
        }
        if (Arrays.equals(sHash, tHash)) {
            return true;
        }
        return false;

        //BRUTE FORCE
        // if(s.length()!=t.length()) return false;
        // char arr1[] = s.toCharArray();
        // char arr2[] = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if(Arrays.equals(arr1,arr2)) return true;
        // else return false;

    }
}