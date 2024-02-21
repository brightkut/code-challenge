package playground;

public class Main4 {
    public static void main(String[] args) {

        int [] a = {2,3,-5};
        int [] a2 = {3,2,-3,-4};
        System.out.println(returnToBoundaryCount(a));
        System.out.println(returnToBoundaryCount(a2));
    }

    public  static int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int res = 0;

        for(int i =0 ; i < nums.length ; i++){
            res+=nums[i];
            if(res == 0) count++;
        }

        return count;
    }

    // Minimum Time to Revert Word to Initial State I
    // Find the Grid of Region Average
    //Minimum Time to Revert Word to Initial State II
}
