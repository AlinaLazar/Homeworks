package C18BinarySearchLeetcode;

public class SearchInSortedArray {
    public static int search(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target) {
                result = i;

                break;
            } else {
                result = -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(sortedArray, target));
        System.out.println(searchBinary(sortedArray, target));
    }

    //binarySearch
    public static int searchBinary(int[] nums, int target) {

        if (nums == null || nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while(left <= right){
            middle = (left + right) /2;
            if (nums[middle] == target){
                return middle;
            }
            if (nums[left] <= nums[middle]){
                if (nums[left] <= target && target < nums[middle]){
                    right = middle - 1;
                } else{
                    left = middle + 1;
                }
            } else {
                if(nums[middle] < target && target <= nums[right]){
                    left = middle + 1;
                } else{
                    right = middle - 1;
                }

            }
        }
        return nums[left] == target ? left : -1;
    }

}
