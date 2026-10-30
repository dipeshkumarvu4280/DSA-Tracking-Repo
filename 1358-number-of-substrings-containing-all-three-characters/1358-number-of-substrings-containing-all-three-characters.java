class Solution {
    public int numberOfSubstrings(String s) {

        int count = 0;
        int left = 0;
        int[] freq = new int[3];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                count += s.length() - right;

                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;

                left++;
            }
        }

        return count;





        //BRUTE FORCE
        // char[] arr = s.toCharArray();

        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         String sub = s.substring(i, j + 1);
        //         if (sub.contains("a") && sub.contains("b") && sub.contains("c")) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}