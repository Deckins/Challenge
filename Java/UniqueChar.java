class Solution {
    int ret = 0;
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i =0; i< s.length();i++){
            if(map.containsKey(s.charAt(i)) == false){
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        map.forEach((k,v) -> {
            System.out.println(k + " " +v);
            if(v == 1){
                // this.ret = k;
                list.add(k);
            }

        });
        if(list.isEmpty()) return -1;
        int index = 0;
        Character found = list.get(0);
        for(int i = 0; i<s.length();i++){
            if(found == s.charAt(i)){
                index = i;
                return index;
            }
           
        }
        return index;
      
    }
}