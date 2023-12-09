package leetcode.string.other.add_string_415;

public class Main {
    public static void main(String[] args) {
       //num1 = "11", num2 = "123"
        System.out.println(addStrings("11","123"));
    }

    //pass
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();

        int lenNum1 = num1.length()-1;
        int lenNum2 = num2.length()-1;

        int carry = 0;

        int c = lenNum1 > lenNum2 ? lenNum1 : lenNum2;

        while (c>=0){
            int n1 , n2 = 0;
//            System.out.println("len1" + lenNum1);
//            System.out.println("len2" + lenNum2);
            n1 = (lenNum1 < 0 ? '0' : num1.charAt(lenNum1)) - '0';
            n2 = (lenNum2 < 0 ? '0' : num2.charAt(lenNum2)) - '0';

//            System.out.println("n1: "+n1);
//            System.out.println("n2: "+n2);

            int sum = n1 + n2 + carry;
            carry = sum/10;
            int res = sum %10;
            stringBuilder.append(res);
            c--;
            lenNum1--;
            lenNum2--;
        }
        System.out.println(carry);


        if(carry > 0) stringBuilder.append(carry);

        return stringBuilder.reverse().toString();
    }
}
