package C25ExercisesStackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Deque<String> stack = new LinkedList<>();

        for (String string : logs){
            switch(string){
                case "../":
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                case "./":
                    break;
                default:
                    stack.push(string);
                    break;
            }
        }
        return stack.size();
    }
}
