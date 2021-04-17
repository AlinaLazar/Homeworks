package C27Seturi;

import java.util.HashSet;
import java.util.Set;
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be
// unique and you may return the result in any order.


public class IntersectionsOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            if(!set1.contains(nums1[i])){
                set1.add(nums1[i]);
            }
        }
        for(int j = 0 ; j < nums2.length; j ++){
            if(set1.contains(nums2[j])){
                resultSet.add(nums2[j]);
            }
        }
        int [] result = new int[resultSet.size()];
        int index = 0;
        for (int s : resultSet){
            result[index++] = s;
        }
        return result;
    }
}
