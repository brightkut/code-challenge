package playground;


import java.util.Stack;

public class Main3 {

    //Example 1:
    //
    //Input: nums = [1,12,-5,-6,50,3], k = 4
    //Output: 12.75000
    //Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    //Example 2:
    //
    //Input: nums = [5], k = 1
    //Output: 5.00000

    // Pass
    public static void main(String[] args) {
        int []nums = {1,12,-5,-6,50,3};
        int []nums2 = {5};


        System.out.println(findMaxAverage(nums,4));
        System.out.println(findMaxAverage(nums2,1));
        Stack<String>s = new Stack<>();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char str : s.toCharArray()){
            if(str == '(' || str == '[' || str == '{'){
                stack.push(str);
            }else {
                if(stack.isEmpty()){
                    return false;
                }

                if(str == ')' && stack.pop()!='(' ){
                    return false;
                }
                else if(str == ']' && stack.pop()!='['){
                    return false;
                }
                else if(str=='}' && stack.pop()!='{'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static double findMaxAverage(int[] nums, int k) {
        double curr = 0 ;

        int sum = 0;

        for (int i = 0 ; i < k ; i++){
            sum+= nums[i];
        }

        curr = (double) sum / k;

        for(int i = k ; i < nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            curr = Math.max((double) sum /k,curr);
        }


        return  curr;
    }
}
