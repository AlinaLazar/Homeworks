package C27Seturi;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?


    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return 0;
    }


    //     public int singleNumber(int[] nums) {
//         for (int i = 0; i < nums.length; i++){
//             int counter = 0;
//             for (int j = 0; j < nums.length; j++){
//                 if (nums[i] == nums[j]){
//                     counter++;
//                 }
//             }
//             if (counter == 1){
//                 return nums[i];
//             }
//         }

//         return -1;
//     }
}
