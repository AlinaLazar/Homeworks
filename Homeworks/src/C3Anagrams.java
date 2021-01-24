import java.util.Arrays;
public class C3Anagrams {

    public static String filterNonLetterCharacters ( String s) {
        StringBuilder sBuilder = new StringBuilder(s);

        for (int i = 0; i < sBuilder.length(); i++) {
            if (!Character.isLetter(sBuilder.charAt(i))) {
                sBuilder.deleteCharAt(i);
                i--;
            }
        }
        return sBuilder.toString();
    }

    public static boolean anagramSolver(String anagram1, String anagram2) {
        String anagram1Letters = filterNonLetterCharacters(anagram1);
        String anagram2Letters = filterNonLetterCharacters(anagram2);

        anagram1Letters = anagram1Letters.toLowerCase();
        anagram2Letters = anagram2Letters.toLowerCase();

        char [] anagram1Array = anagram1Letters.toCharArray();
        char [] anagram2Array = anagram2Letters.toCharArray();

        Arrays.sort(anagram1Array);
        Arrays.sort(anagram2Array);
        return Arrays.equals(anagram1Array, anagram2Array);
    }


    public static void main(String[] args) {

        System.out.println(anagramSolver("fairy tales!", "rail, safety"));
        System.out.println(anagramSolver("silver bullet", "sunny day"));

    }
}
