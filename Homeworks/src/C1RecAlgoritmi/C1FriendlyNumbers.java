package C1;

public class C1FriendlyNumbers {

    public static int sumDivs(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areFriends(int firstNumber, int secondNumber) {
        return (sumDivs(firstNumber) == secondNumber) && (sumDivs(secondNumber) == firstNumber);
    }

    public static void findAllFriends(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            for (int j = i + 1; j <= upper; j++) {
                if (areFriends(i, j)) {
                    System.out.println(i + "-" + j);
                }
            }
        }
    }
    public static int findFriend(int number) {
        int possibleFriend = sumDivs(number);
        int sumDivsOfPossibleFriend = sumDivs(possibleFriend);

        if (sumDivsOfPossibleFriend == number && possibleFriend != number && number < possibleFriend) {
            return possibleFriend;
        }
        return -1;
    }

    public static void findAllFriendsV2(int left, int right) {
        for (int i = left; i <= right; i++) {
            int possibleFriend = findFriend(i);
            if (possibleFriend != -1) {
                System.out.println(i + "-" + possibleFriend);
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        findAllFriendsV2(1, 5000);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000_000_000d;
        System.out.println(duration);

        long startTime2 = System.nanoTime();
        findAllFriends(1, 5000);
        long endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1_000_000d;
        System.out.println(duration2);
    }
}
