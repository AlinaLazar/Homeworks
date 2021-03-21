package C17AnalizaComplexitatiiAlgoritmilor;

public class Exercise1 {

    //1.returneaza indexul :
    public static int binarySearchAux(int[] sortedList, int key) {
        int left = 0;
        int right = sortedList.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (key == sortedList[middle]) {
                return middle;
            } else if (key < sortedList[middle]) {
                right = middle - 1;
            } else if (key > sortedList[middle]) {
                left = middle + 1;
            }
        }
        return -1;
    }

    //2.daca elementul nu se afla in lista: pozitia de insertie a elementului in lista. Mai exact, se va returna
    // pozitia pe care ar trebui inserat elementul a.i. lista sa ramana ordonata.

    public static int searchInsertPosition(int[] sortedList, int key) {
        int count=0;

        for(int i = 0; i < sortedList.length; i++) {
            if(sortedList[i] == key)
                return i;
        }
        for(int i = 0; i < sortedList.length;i++) {
            if(key > sortedList[i])
                count = i + 1;
        }
        return count;
    }


    public static void main(String[] args) {
        int [] sortedList = {1, 3, 8, 12, 15, 19, 43, 61, 78, 92};
        int key = 43;
        int aux = 2;
        System.out.println(binarySearchAux(sortedList,key));
        System.out.println(searchInsertPosition(sortedList,aux));

    }
}
