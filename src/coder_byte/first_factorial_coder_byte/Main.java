package coder_byte.first_factorial_coder_byte;

public class Main {
    public static void main(String[] args) {

        System.out.println(FirstFactorial(8));
    }

    public static int FirstFactorial(int num) {
        int result = 1;

        for(int i = num; i>=1 ; i--){
            result*=i;
        }
        return result;
    }
}
