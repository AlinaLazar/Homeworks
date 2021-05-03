package C30WriteAndReadFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner2 = new Scanner(System.in);
        String word1 = scanner2.nextLine();
        String word2 = scanner2.nextLine();

        List<String> list = new ArrayList<>();
        try(Scanner scanner = new Scanner( new BufferedReader(new FileReader("TextInput.txt")))) {
            while(scanner.hasNextLine()) {

                list.add(scanner.nextLine());
            }
        }
        List<String> auxList = new ArrayList<>();
        for(String s : list){
            s = replaceWord(s,word1,word2);
            auxList.add(s);
        }

        try (BufferedWriter output = new BufferedWriter(new FileWriter("TextInput.txt"))) {
            for (String word : auxList) {
                output.write(word + "\n");
            }

        }
        scanner2.close();
    }

    public static String replaceWord(String str, String word1, String word2){
        str = str.replaceAll(word1, word2);
        return str;
    }
}
