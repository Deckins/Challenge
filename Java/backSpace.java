class Solution {
    public boolean backspaceCompare(String S, String T) {
        int index = S.indexOf("#");
        while(index != -1){
            if(index == 0){
                S = S.substring(1);
            }else if(index > 0){
                S = S.substring(0,index-1) + S.substring(index+1);
            }
            index = S.indexOf("#");
        }
        
        int index2 = T.indexOf("#");
        while(index2 != -1){
            if(index2 == 0){
                T = T.substring(1);
            }else if(index2 > 0){
                T = T.substring(0,index2 -1) + T.substring(index2 +1);
            }
            index2 = T.indexOf("#");
        }
        return S.equals(T);
    }
}