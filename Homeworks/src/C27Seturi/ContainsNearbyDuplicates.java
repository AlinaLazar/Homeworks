package C27Seturi;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.

public class ContainsNearbyDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k)
                    return true;

            }
            map.put(nums[i] , i);
        }
        return false;
    }

}
