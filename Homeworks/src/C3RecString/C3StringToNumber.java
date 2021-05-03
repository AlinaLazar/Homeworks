package C3RecString;

public class C3StringToNumber {
    public static int convertStringToNumber(String numberString) {        //varianta fara folosirea functiilor clasei String
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int number = 0;

        for (int i = 0; i < numberString.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (numberString.charAt(i) == digits[j]) {

                    number = number * 10 + j;
                }
            }
        }

        return number;
    }


    public static int convertStringToNumberV2 (String numberString){    // cu functie din clasa String
        return Integer.parseInt(numberString);
    }
    public static void main(String[] args) {

        System.out.println(convertStringToNumber("123"));

        System.out.println(convertStringToNumberV2("4567"));
    }
}
