package leetcode.math.happy_number_202;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


//        System.out.println(isHappy(2));
        System.out.println(isHappy(19));

//        System.out.println(isHappy2(2));
    }

    public static boolean isHappy(int n) {
        //  res , mod 10 =1 return true
        //

        HashSet<Integer> result = new HashSet<>();


        int rs= n;

        while( rs !=1 && !result.contains(rs)){
            result.add(rs);
            rs = getSquare(rs);;
        }

        return rs == 1;
    }

    public  static  int getSquare(int n){
        int sums = 0;

        while (n > 0){
            int lastElement = n % 10;
            //cut last int
            n = n / 10;
            sums+= lastElement * lastElement;
        }

        return sums;
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean  isHappy2(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            System.out.println(n);
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
