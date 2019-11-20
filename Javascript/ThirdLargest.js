/**
 * @param {number[]} nums
 * @return {number}
 * Find the third largest number in an array
 * Current solution does not run in O(n) time
 * Uses a set to remove duplicates
 * https://leetcode.com/problems/third-maximum-number/submissions/
 */
var thirdMax = function(nums) {
    let biggest = nums[0];
    let secBiggest = null
    let thirdBiggest = null
    let countDup = 0;
   
  for(let i =1; i<nums.length;i++){
      if(biggest == nums[i] || secBiggest == nums[i] || thirdBiggest == nums[i]){
          countDup++;
          continue;
      }
      if(biggest < nums[i]){
          if(secBiggest != null)
          thirdBiggest = secBiggest;
          secBiggest = biggest;
          biggest = nums[i];
      } 
      else if(secBiggest < nums[i]){
          thirdBiggest=secBiggest;
          secBiggest=nums[i];
      } 
      else if(thirdBiggest == null || thirdBiggest < nums[i]){
          thirdBiggest = nums[i];
      }
  }
    if(nums.length - countDup < 3){
        return Math.max(...nums)
    } else return thirdBiggest;
};
