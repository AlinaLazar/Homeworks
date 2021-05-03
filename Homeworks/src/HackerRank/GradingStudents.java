package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++){
            int currentGrade = grades.get(i);
            if (currentGrade < 38){
                result.add(currentGrade);
            } else if (currentGrade % 5 >= 3){
                result.add(currentGrade + (5 - currentGrade % 5));
            } else {
                result.add(currentGrade);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {84, 94, 21, 0, 18, 100, 18, 62, 30, 61, 53};
        List<Integer> arrayList = new ArrayList<>();
        for(int i : arr){
            arrayList.add(i);
        }
        System.out.println(gradingStudents(arrayList));
    }
}
