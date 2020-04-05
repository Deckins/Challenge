class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            int index = 0;
            if(nums[i] == 0){
                index = i;
                for(int j = 0; j< nums.length-1; j++){
                    if(nums[j] == 0){
                        while(nums[j+1] == 0 && j<nums.length-2){
                          j++;  
                        }
                        nums[index] = nums[j+1];
                        nums[j+1] = 0;
                        index++;
                    }
                }
            }
        }
    }
}