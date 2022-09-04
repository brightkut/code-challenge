package leetcode.array.find_nearest_point_1779;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {3,1},
                {2,4},
                {2,3},
                {4,4}
        };
        System.out.println(nearestValidPoint(3,4,a));

    }

    public  static int nearestValidPoint(int x, int y, int[][] points) {

        //count
        int c = 0 ;
        int min = Integer.MAX_VALUE;
        int index = -1;

        if(points[0].length ==1 ) return 0;

        for(int i=0; i< points.length ;i++){
            if(points[i][0] == x || points[i][1] ==y){
               if (calDistance(x,y,points[i][0],points[i][1]) < min ){
                   index = i;
                   min = calDistance(x,y,points[i][0],points[i][1]);
                   c++;
               }
            }
        }

        return index;
    }


    public static int calDistance(int x, int y , int x2 , int y2){
        return Math.abs(x-x2)+Math.abs(y-y2);
    }
}
