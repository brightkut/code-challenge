package coder_byte.first_reverse_coder_byte;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstReverse("I Love Code"));
    }

    public static String FirstReverse(String str) {
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }
}
