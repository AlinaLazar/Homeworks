package Project3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PostfixCalculate {

    public static String postfix(String string) {
        Deque<Character> stack = new LinkedList<>();
        String postfix = "";
        char[] ch = string.toCharArray();

        for (char c : ch) {
            if (Character.isDigit(c)) {
                postfix = postfix + c;
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                while (!stack.isEmpty() && stack.peek() != '(' && (getPriority(c) <= getPriority(stack.peek()))) {
                    postfix = postfix + stack.pop();

                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix = postfix + stack.pop();
                }
                if (stack.isEmpty()) {
                    return "Expresia contine paranteze gresite!";
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }
        return postfix;
    }

    public static int getPriority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 3;
        }
    }

    public static int calculate(String string) {
        Deque<Integer> stack = new LinkedList<Integer>();
        char[] ch = string.toCharArray();
        int op1 = 0;
        int op2 = 0;
        int sum = 0;

            for (Character c : ch) {
                switch (c) {
                    case '+':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op1*op2);
                        break;
                    case'/':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push(op2/op1);
                        break;
                    case'^':
                        op1 = stack.pop();
                        op2 = stack.pop();
                        stack.push((int) Math.pow(op2,op1));
                        break;
                    default:
                        if (c >= '0' || c <= '9' ) {
                            int aux = c - '0';
                            stack.push(aux);
                        }
                        break;
                }

            }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String string = "3+(2+1)*2^3^2-8/(5-1*2/2)";

        System.out.println(postfix(string));
        System.out.println("321+232^^*+8512*2/-/-");

        String stringCalculate = "(3+(2+1)*2+2^1)";
        System.out.println(postfix(stringCalculate));
        System.out.println(calculate(postfix(stringCalculate)));
    }
}
