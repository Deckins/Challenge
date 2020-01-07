class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        // map.forEach((k,v)-> {
        //     System.out.println(k+" " +v);
        //     if(v == 1){
        //         return k;
        //     }
        // });
        return nums.length;
    }
}