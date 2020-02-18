class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        String pali = "";
        if(s.length() != 0) pali = s.substring(0,1);
        String temp = "";
        for(int i = 0; i<s.length();i++){
            for(int j = i+1; j<s.length(); j++ ){
                temp = s.substring(i,j+1);
                if(Palindrome(temp)){
                    if(temp.length() > pali.length()){
                        pali = temp;
                    }
                    
                }
            }
        }
        return pali;
    }
    
    public static boolean Palindrome(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(s.length() -1 - i)){
                
            } else {
                return false;
            }
        }
        return true;
    }
}