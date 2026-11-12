class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] hash = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            hash[ch - 'a']++;
        }

        int b = hash['b' - 'a'];
        int a = hash['a' - 'a'];
        int l = hash['l' - 'a'] / 2;
        int o = hash['o' - 'a'] / 2;
        int n = hash['n' - 'a'];

        return Math.min(b, Math.min(a,
                Math.min(l, Math.min(o, n))));
    }
}