class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            hash[ch - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (hash[ch - 'a'] > 0) {//if char is available
                hash[ch - 'a']--;//use available char and decrease its freq
            } else {
                return false;
            }
        }
        return true;

        //OR
        
                // HashMap<Character, Integer> map = new HashMap<>();
                // for (int i = 0; i < magazine.length(); i++) {
                //     char ch = magazine.charAt(i);
                //     map.put(ch, map.getOrDefault(ch, 0) + 1);
                // }

                // for (int i = 0; i < ransomNote.length(); i++) {
                //     char ch = ransomNote.charAt(i);
                //     if (map.getOrDefault(ch, 0) == 0) {
                //         return false;
                //     }
                //     map.put(ch, map.get(ch) - 1);
                // }
                // return true;
            }
        }
  