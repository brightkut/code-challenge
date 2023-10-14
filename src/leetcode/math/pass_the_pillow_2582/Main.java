package leetcode.math.pass_the_pillow_2582;

public class Main {
    //Input: n = 4, time = 5
    //Output: 2
    //Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
    public static void main(String[] args) {
        System.out.println(passThePillow(4,5));
        System.out.println(passThePillow(3,2));
    }

    public static int passThePillow(int n, int time) {
        int s = 1;
        boolean f = false;

        while (time > 0){
            if(!f){
                s++;
            }else {
                s--;
            }

            // update flag 1
            if(s==n){
                f = true;
            }
            // update flag 2
            else if(f && s ==1){
                f = false;
            }
            time--;
        }

        return s;
    }
}
