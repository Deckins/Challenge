class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length-1;
        boolean looped = false;
        while(digits[size] == 9) {
            digits[size] = 0;
            if(size !=0) size--;
            looped = true;
        }
        if(digits[size] == 0 && looped == true){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for(int i = 0; i<digits.length; i++){
                arr[i+1] = digits[i];
            }
            return arr;
        } else {
            digits[size] = digits[size] + 1;
        }
            
       
        
      return digits;
    }
}