package leetcode.string.other.final_value_2011;

public class Main {
    public static void main(String[] args) {
        String[] input = {"--X","X++","X++"};
        String[] input2 = {"++X","++X","X++"};
        String[] input3 = {"X++","++X","--X","X--"};

        System.out.println(finalValueAfterOperations(input));
        System.out.println(finalValueAfterOperations(input2));
        System.out.println(finalValueAfterOperations(input3));
    }

    public  static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            if (operation.charAt(0) == 'X') {
                if (operation.charAt(1) == '+') {
                    x++;
                } else {
                    x--;
                }
            } else if (operation.charAt(0) == '+') {
                ++x;
            } else {
                --x;
            }
        }

        return x;
    }
}
