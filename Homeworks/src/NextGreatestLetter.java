class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        char result = ' ';
        for (int i = 0; i < letters.length; i++){
            if (letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));

    }
}
