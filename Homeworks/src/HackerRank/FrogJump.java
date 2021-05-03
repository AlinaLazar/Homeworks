package HackerRank;

public class FrogJump {

    public static int solution(int X, int Y, int D){
        int count = 0;
        int state = X;
        while(state < Y){
            state = state + D;
            count++;
        }
        return count;
    }
    public static int solution2(int X, int Y, int D){

        return (int) Math.ceil((Y - X) / (float)D);
    }


    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(solution2(X,Y,D));
    }
}
