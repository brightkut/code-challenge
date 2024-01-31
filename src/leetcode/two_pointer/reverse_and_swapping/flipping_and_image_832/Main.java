package leetcode.two_pointer.reverse_and_swapping.flipping_and_image_832;

public class Main {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0 ; i < image.length ; i++){
            flipHorizontal(image[i]);
            invert(image[i]);
        }

        return image;
    }

    public static void flipHorizontal(int [] nums){
        int l = 0 , r = nums.length-1;
        while(l<r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }

    public static void invert(int [] nums){
        for (int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = 1;
            }else{
                nums[i] = 0;
            }
        }
    }
}
