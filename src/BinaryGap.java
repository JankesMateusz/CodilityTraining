// Write a function that, given a positive integer N,
// returns the length of its longest binary gap.
// The function should return 0 if N doesn't contain a binary gap.

public class BinaryGap {

    public static void main(String[] args){

        System.out.println(solution( 15));

    }

    public static int solution(int N){

        int gap = 0;
        int biggestGap = 0;

        String binary = Integer.toBinaryString(N);
        System.out.println(binary);

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                for(int j = i + 1; j < binary.length(); j++){
                    if(binary.charAt(j) == '0')
                        gap++;
                    else {
                        if (gap > biggestGap)
                            biggestGap = gap;
                        gap = 0;
                    }
                }
            }
        }

        return biggestGap;
    }

}
