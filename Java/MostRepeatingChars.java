class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int max = 0;
        boolean dup = false;
        Set<Character> set = new HashSet<>(); 
        // List<Integer> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            set.clear();
            for( int j = i; j<s.length(); j++){
                if(set.contains(s.charAt(j)) == false){
                    set.add(s.charAt(j));
                    count++;
                    
                } else {
                    break;
                } 
            }
            
            max = Math.max(max,count);
            
            count = 0;
            
        }
        return max;
    }
}