class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i)) == false){
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i< t.length(); i++){
            if(map2.containsKey(t.charAt(i)) == false){
                map2.put(t.charAt(i),1);
            } else {
                map2.put(t.charAt(i),map2.get(t.charAt(i)) + 1);
            }
        }
        
        return map.equals(map2);
    }
}