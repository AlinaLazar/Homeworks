package Workshop4;

public class ReverseWords {
    public static String reverseWords(String s) {
            String[] words = s.split(" +");

            StringBuilder sb = new StringBuilder();
            for (int i = words.length; i > 0; i--) {
                sb.append(words[i-1] + " ");
            }

            return sb.toString().trim();
        }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

}
