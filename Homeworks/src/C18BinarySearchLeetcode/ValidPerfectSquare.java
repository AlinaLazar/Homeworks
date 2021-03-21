package C18BinarySearchLeetcode;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while (left <= right){
            int middle  = (left + right)/2;
            long result = (long)middle * middle;
            if (result == num){
                return true;
            } else if (result > num){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}
