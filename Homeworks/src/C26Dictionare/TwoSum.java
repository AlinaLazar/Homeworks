package C26Dictionare;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2] ;
        // for (int i = 0; i <= nums.length-1; i++){
        //     for(int j = i+1; j <= nums.length -1; j++){
        //         if ((nums[i] + nums[j]) == target){
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }
        // return result;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length-1; i++){
            int complementar = target - nums[i];
            if (map.containsKey(complementar)){
                result [0] = map.get(complementar);
                result [1] = i;

            } else {
                map.put(nums[i], i);
            }
        }
        return result ;
    }
}
