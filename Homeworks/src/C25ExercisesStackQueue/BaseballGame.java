package C25ExercisesStackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        Deque<Integer> stackScore = new LinkedList<Integer>();

        for (String string : ops) {
            switch (string) {
                case "+":
                    int op1 = stackScore.pop();
                    int op2 = stackScore.pop();
                    stackScore.push(op2);
                    stackScore.push(op1);
                    stackScore.push(op1 + op2);
                    break;
                case "D":
                    stackScore.push(stackScore.peek() * 2);
                    break;
                case "C":
                    stackScore.pop();
                    break;
                default:
                    stackScore.push(Integer.valueOf(string));
                    break;
            }
        }
        int sum = 0;
        while (!stackScore.isEmpty()) {
            sum += stackScore.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strings = {"5", "2", "C", "D", "+" };
        System.out.println(calPoints(strings));
    }
}
