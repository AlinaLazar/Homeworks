package C27Seturi;

import java.util.HashSet;
import java.util.Set;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
// element is distinct.

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums){
            set.add(i);
        }

        if (nums.length == set.size()){
            return false;
        }
        return true;
    }
}
