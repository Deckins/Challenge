/**
 * @param {number[]} nums
 * @return {number}
 * Find the third largest number in an array
 * Current solution does not run in O(n) time
 * Uses a set to remove duplicates
 * https://leetcode.com/problems/third-maximum-number/submissions/
 */
var thirdMax = function(nums) {
    let uniqueSet = new Set(nums)
    nums = [...uniqueSet];
    let biggest = nums[0];
    let secBiggest = null
    let thirdBiggest = null
  if(nums.length < 3){
      return Math.max(...nums);
  } else{
      for(let i =1; i<nums.length;i++){
          if(biggest < nums[i]){
              if(secBiggest != null)
              thirdBiggest = secBiggest;
              secBiggest = biggest;
              biggest = nums[i];
          } 
          else if(secBiggest < nums[i]){
              thirdBiggest=secBiggest;
              secBiggest=nums[i];
          } else if(thirdBiggest == null || thirdBiggest < nums[i]){
              thirdBiggest = nums[i];
          }
      }
  }
  return thirdBiggest;
};
console.log(thirdMax([0,1,-2147483648,2,2,1,-399999]));