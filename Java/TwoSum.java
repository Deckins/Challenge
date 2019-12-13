import java.util.HashMap;
class TwoSum {

    public static void main(String[] args){
        int[] test = {1,0,3,4};
        System.out.println(calcSum(test,7)[0]);
        System.out.println(calcSum(test,7)[1]);

        System.out.println("Hi");
    }
    public static int[] calcSum(int[] nums,int target){
        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i =0; i<nums.length;i++){
            // map.put(nums[i],i);
            //Checks for null to make sure does not get itself
            if(map.get(target - nums[i]) != null){
                ret[0] = i;
                ret[1] = map.get(target-nums[i]);
                // return ret;
            } else {
                map.put(nums[i],i);

            }
        }
        return ret;
    }
}