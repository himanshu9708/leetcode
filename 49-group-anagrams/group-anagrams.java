class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for( String s : strs){
            char [] chars  = s.toCharArray();
            Arrays.sort(chars);
            String value = new String(chars);
            if(!map.containsKey(value)){
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(s);

        }
        return new ArrayList(map.values());

        
    }
}