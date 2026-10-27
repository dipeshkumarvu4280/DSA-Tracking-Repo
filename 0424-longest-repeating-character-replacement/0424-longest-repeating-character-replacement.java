class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxFreq = 0;
        int maxWindow = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;

        //update the max frequency
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowLen = right - left + 1;

            if (windowLen - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;//shrinking
                left++;
            }
            windowLen = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLen);
        }
        return maxWindow;
    }
}