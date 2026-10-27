class Solution {
    public String minWindow(String s, String t) {
      if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];

        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        int left = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (need[ch] > 0) {
                required--;
            }

            need[ch]--;

            while (required == 0) {
                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

                if (need[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE? "": s.substring(startIndex, startIndex + minLen);
    }
}