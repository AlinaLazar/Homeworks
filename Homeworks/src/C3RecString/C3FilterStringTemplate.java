package C3;

import java.util.Arrays;

public class C3FilterStringTemplate {

    public static String [] filterString (String [] words, String key, int matchKey){
        String[] filteredWords = new String[words.length];
        int size = 0;
        key = key.toLowerCase();

        for (int i = 0; i < words.length; i++){
            String currentWord = words[i].toLowerCase();
            int countMatches = 0;
            int minLength = Math.min(currentWord.length(), key.length());
            for (int j = 0; j < minLength; j++){
                if (currentWord.charAt(j) == key.charAt(j)){
                    countMatches++;
                }
            }
            if (countMatches >= matchKey){
                filteredWords[size] = words[i];
                size++;
            }
        }
        return Arrays.copyOf(filteredWords,size);
    }

    public static void main(String[] args) {
        String [] words = {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
        String key = "plot";
        int matchKey = 1;

        String [] newString = filterString(words,key,matchKey);

        for (int i = 0; i < newString.length ; i++){
            System.out.print(newString[i] + " ");
        }

    }
}
