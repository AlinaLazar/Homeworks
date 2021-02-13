package C5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C5Exercise2 {

    public static  void frecventaMaxima(String sir) {
            int[] allPlaces = new int[128];
            sir = sir.toLowerCase().replaceAll("\\s+", "");
            int length =  sir.length();
            Integer[] filledPlaces = new Integer[length];

            for (int i = 0 ; i < length ; i++)
            {
                allPlaces[sir.charAt(i)]++;
                filledPlaces[i] = allPlaces[sir.charAt(i)];
            }
            ArrayList<Integer> listWithResults = new ArrayList<Integer>(Arrays.asList(filledPlaces)) ;
            int max = Collections.max(listWithResults);
            for(int i= 0; i < length ; i++)
            {
                if(listWithResults.get(i) == max)
                    System.out.println("Caracterul cu numar maxim de aparitii este:"+ sir.charAt(i)+  " ." +
                            "Acesta apare de " + Collections.max(listWithResults)+ " ori");
            }
        }



    public static void main(String[] args) {
        String caractere = "Becoming a programmer is like gaining super powers!";
        frecventaMaxima(caractere);

    }

}
