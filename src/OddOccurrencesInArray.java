// Write a function that, given an array A consisting of N integers fulfilling the above conditions,
// returns the value of the unpaired element.

public class OddOccurrencesInArray {

    public static void main(String[] args){

        int[] tab = {9, 3, 9, 3, 9, 2, 9};

        System.out.println(solution(tab));

    }

    public static int solution(int[] A){


        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
        }
        return elem;
    }

}
