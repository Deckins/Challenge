class Solution {
    public int countPrimes(int n) {
        int primeCount = 0;
        for(int i=1;i<n;i++){
            int count =0;
            for(int j =1; j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count ==2){
                // System.out.println(i);
                primeCount++;
            }
        }
        return primeCount;
    }
}