package C30WriteAndReadFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_1 {
        public static void main(String[] args) throws IOException {
            Scanner scanner2 = new Scanner(System.in);
            String word1 = scanner2.nextLine();
            String word2 = scanner2.nextLine();

            List<String> list = new ArrayList<>();
            try(Scanner scanner = new Scanner( new BufferedReader(new FileReader("TextInput.txt")))) {
                while(scanner.hasNextLine()) {
                    String nextLine = scanner.nextLine();
                    String lineWithReplacedWord = replaceWord(nextLine,word1,word2);
                    try (BufferedWriter output = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
                        output.write(lineWithReplacedWord + "\n");

                    }
                }
            }
            scanner2.close();
        }

        public static String replaceWord(String str, String word1, String word2){
            str = str.replaceAll(word1, word2);
            return str;
        }
}
