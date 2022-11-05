package leetcode.math.substractproduct_and_sum_1281;

public class Main {
    public static void main(String[] args) {

        int input1 = 234;
        int input2 = 4421;

        System.out.println(subtractProductAndSum(input1));
        System.out.println(subtractProductAndSum(input2));
    }

    public static int subtractProductAndSum(int n) {
        int s = n , product = 1, sum = 0;

        while(s != 0){
            int d = s%10;
            product*=d;
            sum+=d;
            s/=10;
        }

        return product-sum;
    }
}
