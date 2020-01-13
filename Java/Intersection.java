class Solution {
    int count = 0;

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i]) == false) {
                map1.put(nums1[i], 1);
            } else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map1.containsKey(nums2[i]) == true) {
                if (map1.get(nums2[i]) > 0) {
                    System.out.println(nums2[i] + " " + i);
                    map1.put(nums2[i], map1.get(nums2[i]) - 1);
                    res[count] = nums2[i];
                    count++;

                }
            }
        }
        int[] newarr = new int[count];
        for (int i = 0; i < count; i++) {
            newarr[i] = res[i];
        }
        return newarr;
    }
}