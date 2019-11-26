//https://leetcode.com/problems/sort-array-by-parity/solution/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] newArr = new int[A.length];
        int start =0;
        int end = A.length -1 ;;
        for(int i = 0; i< A.length; i++){
            if(A[i] % 2 == 0){
                newArr[start++] = A[i];
            } else {
                newArr[end--] = A[i];
            }
        }
        return newArr;
    }   
}