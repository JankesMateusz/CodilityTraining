//A small frog wants to get to the other side of the road. The frog is currently located at position X
// and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

//Count the minimal number of jumps that the small frog must perform to reach its target.

public class FrogJmp {

    public static void main(String[] args){
        int jumps = solution(10, 120, 30);

        System.out.println(jumps);
    }

    public static int solution(int X, int Y, int D){

        return ((Y - X)/ D) + 1;
    }

}
