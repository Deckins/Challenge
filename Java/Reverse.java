class Solution {
    public int reverse(int x) {
        String rev = "";
        boolean neg = false;
        String str = Integer.toString(x);
        for(int i=0;i<str.length(); i++){
            if(str.charAt(str.length() -1 -i) == '-'){
                neg = true;
                continue;
            }
            rev += str.charAt(str.length()-1 - i);
            System.out.println(rev);
            
        }
        if(neg == true){
            rev = "-" +rev;U
        }
        while(rev.charAt(0) == 0){
            rev = rev.substring(0,1);
        }
       
        System.out.println(neg);
        System.out.println(rev);
        long reversed = Long.parseLong(rev);
        if(reversed > Integer.MAX_VALUE) return 0;
        if(reversed < Integer.MIN_VALUE) return 0;
        
        return (int)reversed;
        
    }
}