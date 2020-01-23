class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = 0;
        int val = 1;
        if(n % 2 == 1){
            arr[count++] = 0;
        }
        while(count <= n-2){
            arr[count++] = val;
            arr[count++] = -val;
            val++;
        }
        return arr;
    }
}
