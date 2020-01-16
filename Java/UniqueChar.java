public class UniqueChar {

    public static void main (String[] args){
        System.out.println(firstUniqChar("dddccdbbaafffffi"));
    }
    public static int firstUniqChar(String s) {
        boolean matched = false;
        if(s.length() == 1){
            return 0;
        }

        for(int i = 0; i<s.length();i++){
            int notMatchCount= 0;
            for(int j = 0;j<s.length();j++){
                if(s.charAt(i) != s.charAt(j)){
                    notMatchCount++;
                }
            }
            if(notMatchCount == s.length() - 1){
                return i;
            }
        }
        return -1;
    }

}
