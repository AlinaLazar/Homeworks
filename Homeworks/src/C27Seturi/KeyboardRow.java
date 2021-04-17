package C27Seturi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row
// of American keyboard like the image below.
//In the American keyboard:
//the first row consists of the characters "qwertyuiop",
//the second row consists of the characters "asdfghjkl", and
//the third row consists of the characters "zxcvbnm".

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String string1 = "qwertyuiop";
        String string2 = "asdfghjkl";
        String string3 = "zxcvbnm";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        for (char c : string1.toCharArray()) {
            set1.add(c);
        }
        for (char c : string2.toCharArray()) {
            set2.add(c);
        }
        for (char c : string3.toCharArray()) {
            set3.add(c);
        }
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String word1 = words[i];
            String word = word1.toLowerCase();

            boolean valid = true;

            char firstChar = word.charAt(0);

            if (set1.contains(firstChar)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!set1.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            } else if (set2.contains(firstChar)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!set2.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            } else {
                for (int j = 1; j < word.length(); j++) {
                    if (!set3.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                list.add(word1);
            }
        }

        String[] result = new String[list.size()];
        int index = 0;
        for (String str : list) {
            result[index] = str;
            index++;
        }
        return result;
    }
}
