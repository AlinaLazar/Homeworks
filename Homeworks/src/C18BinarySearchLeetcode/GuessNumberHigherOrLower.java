package C18BinarySearchLeetcode;

public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {

        int left = 0;
        int right = n;

        while ( left <= right){
            int middle  = (right - left)/2 + left;
            int result = guess(middle);
            if (result == 0 ){
                return middle;
            } else if (result == -1 ){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;

    }
    public int guess(int no){
        return no;           // un numar random la care se gandeste cineva
    }
}
