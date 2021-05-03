package Workshop4;

public class DuplicateZeros {
    public static void duplicateZeros(int [] arr){
        int counter = 0;
        int [] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            if (counter >= arr.length){
                break;
            }
            newArr[counter] = arr[i];
            counter++;

            if(arr[i] == 0){
                if(counter >= arr.length){
                    break;
                }
                newArr[counter] = 0;
                counter++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = newArr[i];
        }
    }

    public static void main(String[] args) {
        int [] array = {1,0,2,3,0,4,5,0};
        duplicateZeros(array);

    }
}
