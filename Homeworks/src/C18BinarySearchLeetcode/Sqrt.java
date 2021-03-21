package C18BinarySearchLeetcode;

public class Sqrt {
    public int mySqrt(int x) {
        if (x <= 0){
            return 0;
        }
        if ( x == 1){
            return 1;
        }

        int left = 1;
        int right = x/2;

        while (left < right){
            int middle = (left + (right - left)/2) + 1;
            int division = x/middle;

            if (division == middle){
                return middle;
            } else if (division > middle){
                left = middle;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
