package C26Dictionare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants
represented by strings.
You need to help them find out their common interest with the least list index sum. If there is a choice tie between
answers, output all of them with no order requirement. You could assume there always exists an answer.
*/

public class MinimIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < list2.length && i <= minSum; i++){
            if(map.containsKey(list2[i])){
                sum = map.get(list2[i]) + i;
                if (sum < minSum){
                    result.clear();
                    result.add(list2[i]);
                    minSum = sum;
                } else if (sum == minSum){
                    result.add(list2[i]);
                }
            }
        }
        String [] resultArray = new String [result.size()];
        int index = 0;
        for(String s : result){
            resultArray[index] = s;
            index++;
        }
        return resultArray;
    }
}
