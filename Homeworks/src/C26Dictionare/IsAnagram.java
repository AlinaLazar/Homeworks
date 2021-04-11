package C26Dictionare;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s == null || t == null){
            return false;
        }

        Map<Character, Integer> maps = new HashMap<>();
        for (char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c,0)+1);
            System.out.println( c + "->" + maps.getOrDefault(c,0));
        }

        Map<Character, Integer> mapt = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        if (maps.equals(mapt)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "anana";
        String t = "aaann";

       // System.out.println(isAnagram(s,t));

        boolean flag = false;
        if (flag = true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
