package leetcode.two_pointer.trapping_water.trapping_raing_water_42;

public class Main {
    public static void main(String[] args) {
        int [] n = {0,1,0,2,1,0,1,3,2,1,2,1};
        int [] n2 = {4,2,0,3,2,5};

        //6
        System.out.println(trap(n));
        //9
        System.out.println(trap(n2));
    }

//    public static int trap(int[] height) {
//
//        // 1. traverse array without first and last element because it like a border
//        // 2. everytime we will declare left and right
//        // 3. if left and right <= c skip
//        // 4. if left and right > c then (1) left != right area lowest - c (2) left == right -then shift left and right until it not overlength
//
//
//        if(height.length  < 3) return 0;
//
//        int sumArea = 0 ;
//
//        for(int i = 1;  i < height.length- 2; i++){
//
//
//            int c = height[i];
//            int l = i-1;
//            int r = i+1;
//            System.out.println("current: "+ c);
//            System.out.println("hleft: "+ height[l] + " hright: "+  height[r]);
//
//            if(height[l] > c || height[r] > c){
//                if(height[l] != height[r]){
//                    if(height[l] > c && height[r] > c){
//                        int min = Math.min(height[l], height[r]);
//                        sumArea+=min-c;
//                    }else if(height[l] > c){
//                        sumArea+=height[l]-c;
//                    }else if(height[r]>c){
//                        sumArea+=height[r]-c;
//                    }
//                }else {
//                    int maxHl = height[l];
//                    int maxHr = height[r];
//
//
//                    while (l > 0 && r < height.length - 1 && height[l] == height[r]){
//                        l--;
//                        r++;
//
//                        maxHl = Math.max(height[l],maxHl);
//                        maxHr = Math.max(height[r],maxHr);
//                    }
//                    int min = Math.min(maxHl,maxHr);
//                    sumArea+=min-c;
//                }
//            }
//
//            System.out.println("sunArea: "+sumArea);
//
//        }
//        return sumArea;
//    }


    //Pass
    public static int trap(int[] height){
        int l = 0, r = height.length -1 , maxL = height[l] , maxR = height[r];

        int res = 0;
        while (l < r){
            if(maxL < maxR){
                l++;
                maxL = Math.max(maxL, height[l]);
                res += maxL - height[l];
            }else {
                r--;
                maxR = Math.max(maxR, height[r]);
                res+=maxR - height[r];
            }
        }

        return res;
    }
}
