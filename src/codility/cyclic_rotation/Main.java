package codility.cyclic_rotation;

public class Main {
    public static void main(String[] args) {
        int [] input = {3, 8, 9, 7, 6};
        printInt(solution(input,3));
    }

    // run time not pass
    public static int[] solution(int[] A, int K) {

        if(A.length == 1) return A;
        if(K == 0 || K == A.length) return A;

        int [] res = new int[A.length];

        for(int i = 0; i < A.length; i++ ){
            int position = i + K;
            if(position < A.length){
                res[position] = A[i];
            }else {
                res[position-A.length] = A[i];
            }
        }

        return res;
    }

    public static int[] solution2(int[] A, int K) {
        int round = K % A.length;
        // part1
        reverse(A, 0, A.length - round -1);
        // part2
        reverse(A, A.length - round, A.length-1);
        //reverse all
        reverse(A, 0, A.length-1);
        return A;
    }


    public static void reverse(int[]arr , int l ,int r){
        int left = l;
        int right = r;

        while (left < right){
            int temp = arr[right];
            arr[right]  = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
    }

    public static void printInt(int [] arr){
        for (int i : arr) System.out.printf(i + " ");
    }
}
