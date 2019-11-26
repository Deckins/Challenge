class Solution {
    public int[] sortArrayByParity(int[] A) {
   
        int swapPos = 0;
        int temp = 0;
        int oddCount = 0;
        boolean swap = true;
        for(int i =0; i<A.length;i++){
            if(A[i] % 2 == 0){
                temp = A[swapPos];
                A[swapPos] = A[i];
                A[i] = temp;
                if(oddCount > 0){
                    swapPos = swapPos+1;
                    oddCount--;
                } else {
                    swapPos = i;
                }
                swap = false;
            } else if(swap == false)  {
                swapPos = i;
                swap = true;
            } else {
                oddCount++;
            }
        }
        return A;
    }
}