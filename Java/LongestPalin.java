class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return "";
        }
        String pali = "";
        if(s.length() != 0) pali = s.substring(0,1);
        String temp = "";
        int max = 0;
        for(int i = 0; i<s.length()-1; i++){
            for(int j = i+1; j<s.length(); j++ ){
                temp = s.substring(i,j+1);
                if (j-i < max) {
                    continue;
                }
                if(Palindrome(temp)){
                    // if(max > pali.length()){
                    //     max = pali.length();
                    //     pali = temp;
                    // }
                    if(max < j-i){
                        max = j-i;
                        pali = temp;
                    }
                    
                }
            }
            
        }
        return pali;
    }
    
    public static boolean Palindrome(String s){
        for(int i = 0; i<Math.ceil((double)s.length()/2); i++){
            if(s.charAt(i) == s.charAt(s.length() -1 - i)){
                
            } else {
                return false;
            }
        }
        return true;
    }
}