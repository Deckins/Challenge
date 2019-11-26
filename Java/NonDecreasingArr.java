//https://leetcode.com/problems/non-decreasing-array/submissions/

class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean changed = false;
        int changeCount =0;
        int distance = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    changeCount++;
                    distance = j - i;
                    if(distance >1){
                        nums[j] = nums[j-1];
                    } else {
                        nums[i] = nums[j] - 1;
                    }
                    
                    changed = true;
                }
                if(changed == true && changeCount > 1){
                    return false;
                } 
            }   
        }
        return true;
    }
}