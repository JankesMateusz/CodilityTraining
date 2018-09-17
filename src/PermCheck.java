public class PermCheck {

    public static void main(String... args){
        int[] tab = {5, 4, 0, 1, 2, 7};
        solution(tab);

        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println(solution(tab));
    }

    public static int solution(int[] A){

        int difference;
        int tmp;

        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                if(A[j] < A[i]){
                    tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }

        tmp = 1;

        for(int i = 1; i < A.length; i++){
            difference = A[i] - A[i - 1];
            if(difference != 1)
                tmp = difference;
        }

        if(tmp != 1 || A.length == 1)
            return 0;
        else
            return 1;
    }

}
