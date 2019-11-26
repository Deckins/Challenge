//https://leetcode.com/problems/non-decreasing-array/submissions/

//[2,3,3,2,4]
//Sample Input

class Solution {
    public boolean checkPossibility(int[] nums) {
        int changeCount = 0;
        for(int i = 0; i< nums.length-1; i++){
                if(nums[i] > nums[i + 1]){
                    changeCount++;
                    //Raises the value if previous elements are greater
                    if(i>0 && nums[i+1] < nums[i-1]){
                        nums[i+1] = nums[i];
                    }
                    //Decreases the value if there are no other greater elements
                    else {
                        nums[i] = nums[i+1];
                    }
                }
                if(changeCount > 1){
                    return false;
                } 
        }
        return true;
    }
}