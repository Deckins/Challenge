
class AddRemoveReplace{
    public static void main(String[] args){
        System.out.println(checkString("doil","dil"));
    }
    public static boolean checkString(String org, String targ) {

        StringBuilder sbOrg=new StringBuilder(org);
//        StringBuilder sbTarg = new StringBuilder(targ);
        int count = 0;
        for(int i = 0;i<sbOrg.length()-1;i++){
            if(sbOrg.charAt(i) != targ.charAt(i) ){
                if(sbOrg.charAt(i) == targ.charAt(i+1) && sbOrg.length() != targ.length()){
                    sbOrg.insert(i,targ.charAt(i));
                    count++;
                    System.out.println("Insert");
                    System.out.println(sbOrg);
                    System.out.println(targ);
                }
                else if(sbOrg.charAt(i+1) == targ.charAt(i) && sbOrg.length() != targ.length()){
                    sbOrg.delete(i,1);
                    count++;
                    System.out.println("Delete");
                    System.out.println(sbOrg);
                    System.out.println(targ);
                }
                else if(sbOrg.charAt(i+1) == targ.charAt(i+1)){
                    String temp = String.valueOf(targ.charAt(i));
                    sbOrg.replace(i,i+1,temp);
                    count++;
                    System.out.println("Replace");
                    System.out.println(sbOrg);
                    System.out.println(targ);


                }
            }
        }
        if(count >1){
            return false;
        } else return true;

    }
}