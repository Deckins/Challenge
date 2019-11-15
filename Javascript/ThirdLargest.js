/**
 * @param {number[]} nums
 * @return {number}
 * Find the third largest number in an array
 * Current solution does not run in O(n) time
 * Uses a set to remove duplicates
 * https://leetcode.com/problems/third-maximum-number/submissions/
 */
var thirdMax = function(nums) {
      
    nums.sort((a,b)=>{
        return a-b;
    });
    let uniqueSet = new Set(nums)
    nums = [...uniqueSet];
    let biggest = nums[0];
    let secBiggest = 0
    let thirdBiggest = 0
  if(nums.length < 3){
      return Math.max(...nums);
  } else{
      for(let i =1; i<nums.length;i++){
          console.log(nums[i]);
          if(biggest < nums[i]){
              thirdBiggest = secBiggest;
              secBiggest = biggest;
              biggest = nums[i];
          } 
          // else if(secBiggest < nums[i]){
          //     thirdBiggest=secBiggest;
          //     secBiggest=nums[i];
          // } else{
          //     thirdBiggest = nums[i];
          // }
      }
  }
  return thirdBiggest;
};