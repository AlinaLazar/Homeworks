package C14Matrici;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        int maxLimit = 120;
        ArrayList<Integer> listA = new ArrayList<>();
        for(int i = 2; i <= maxLimit; i++){
            listA.add(i);
        }
        ArrayList<Integer> listB = new ArrayList<>();

        for(int i = 0; i < listA.size(); i++) {
            if (isPrime(listA.get(i))){
                listB.add(listA.get(i));
            }
        }

        System.out.print(listA + " ");
        System.out.println();
        System.out.print(listB + " ");

        System.out.println();

        sieveOfEratosthenes(maxLimit);

    }
    //a doua varianta
    public static boolean isPrime(int number){
        int divizorCounter = 0;
        for (int i = 2; i <= number - 1 ; i++){
            if (number % i == 0){
                divizorCounter++;
            }
        }
        return (divizorCounter == 0);
    }

    public static void sieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n+1];
        for(int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for(int p = 2; p*p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true) {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        // Print all prime numbers
        for(int i = 2; i <= n; i++) {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }

}
