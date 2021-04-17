import java.lang.reflect.Array;
import java.util.*;

public class CountValues {

    public static void main(String[] args) {

        List<String> array = Arrays.asList("cristi", "are", "cristi", "devmind", "test", "test", "cristi");
        String[] arrayStrings = {"cristi", "are", "cristi", "devmind", "test", "test", "cristi"};
       // System.out.println(countValues(array));
        count(arrayStrings);
    }

    public static void count (String [] strings){
        if(strings == null){
            System.out.println("Array-ul este null!");
        }
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String str : strings){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }else {
                map.put(str,1);
                list.add(str);
            }
        }
        Collections.sort(list);

        for(String str: list){
            System.out.println(str + "-->" + map.get(str));
        }
    }

    public static HashMap<String, Integer> countValues(List<String> array){
        Collections.sort(array);
        HashMap<String, Integer> result = new HashMap<>();
        String currentString = "";
        int  count = 0;
        for(int i = 0; i <= array.size()-1; i++){
            currentString = array.get(i);
            count = 0;
            for (int j = 0; j <= array.size()-1; j++) {
                if (currentString.equals(array.get(j))) {
                    count++;
                    result.put(currentString, count);
                }
            }
        }
        return result;
    }



}
