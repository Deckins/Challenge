class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        Set<Integer> dups = new HashSet<>();
        int val = n;
        do{
            val = Solution.calcNum(val);
            if(!dups.add(val)){
                return false;
            }
        } 
        while(val != 1);
        return true;
    }
    public static int calcNum(int n){
        List<Integer> list = new LinkedList<>();
        int sum = 0;
        int pow = 0;
        while(n != 0){
            pow = n%10;
            sum += pow * pow;
            n = n/10;
        }
        return sum;
    }
}