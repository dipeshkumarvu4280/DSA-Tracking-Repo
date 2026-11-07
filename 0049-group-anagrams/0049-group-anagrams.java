class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s:strs){

        int []hash = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            hash[ch-'a']++;
        }
        String key = Arrays.toString(hash);
        
        if(map.containsKey(key)){
            map.get(key).add(s);
        }else{
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            map.put(key,list);
        }
     }
     return new ArrayList<>(map.values());
    }
}