// Write a function that, given an array A consisting of N integers and an integer K,
// returns the array A rotated K times.

public class CyclicRotation {

    public static void main(String[] args){

        int[] tab = {1, 2, 3, 4};

        solution(tab, 5);

        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }

    }

    public static int[] solution(int[] A, int K){

        int iterator = 0;

        while(iterator < K){

            int tmp;

            for(int i = A.length - 1; i > 0; i--){
                tmp = A[i - 1];
                A[i - 1] = A[i];
                A[i] = tmp;
            }
            iterator++;
        }

        return A;
    }

}
