package C27Seturi;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    //You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
    // you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have
    // are also jewels.
    //Letters are case sensitive, so "a" is considered a different type of stone from "A".

    public int numJewelsInStones(String jewels, String stones) {
        char [] jewelsChars = jewels.toCharArray();
        char [] stonesChars = stones.toCharArray();
        int count = 0;

        Set<Character> setJ = new HashSet<>();

        for(char i : jewelsChars){
            if(!setJ.contains(i)){
                setJ.add(i);
            }
        }
        for(char s : stonesChars){
            if(setJ.contains(s)){
                count++;
            }
        }
        return count;
    }
}
