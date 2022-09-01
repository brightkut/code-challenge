package leetcode.recursion.fibonacci_509;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib2(2));
    }

    //recursive
    public int fib(int n) {
        if(n ==0 ){
            return 0;
        }else if( n ==1 ){
            return 1;
        }
        return fib(n-2)+fib(n-1);
    }

    //dynamic programming
    public static int fib2(int n) {
        if(n == 0 ) return 0;
        if(n ==1) return  1;

        int [] f = new int[n+1];
        f[0] = 0;
        f[1] =1;

        for(int i = 2 ;i <=n ; i++){
            f[i] = f[i-2]+ f[i-1];
        }

        return f[n];
    }

}
