package leetcode.two_pointer.next_permutation.next_permutation_31;

public class Main {
    public static void main(String[] args) {
        String s = "abb";
        printPermutn(s, "");

    }

    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
//            System.out.println("ros: "+ros);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    public void nextPermutation(int[] nums) {
        // 1. have loop to create permutation
        // 2. If same value will update flag and next round will return
        // 3. If not same value go next
        // 4. If same value but it last round return first value


    }
}
