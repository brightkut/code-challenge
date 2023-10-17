package codility.parking_bill;

public class Main {
    public static void main(String[] args) {
//        System.out.println(solution("10:00","13:21"));
        System.out.println(solution2("10:00","13:21"));
        System.out.println(solution2("09:42","11:42"));
        System.out.println(solution2("08:42","11:42"));
        System.out.println(solution2("01:22","08:22"));
    }

    // Not pass
//    public static int solution(String E, String L) {
//        double start = converStringToDouble(E);
//        double end = converStringToDouble(L);
//        double diff = Math.ceil(end - start)+1;
//
//        int cost = 0;
//        int count =0 ;
//        for(int i = 0; i < diff ; i++){
//            if(i==0){
//                cost+=2;
//            }
//
//            if(i==1){
//                cost+=3;
//            }
//
//            if(i >1){
//                count++;
//            }
//        }
//        return cost + (count *4);
//    }



    public static int solution2(String E, String L) {
        int res = 2;
        float start = converStringToFloat(E);
        float end = converStringToFloat(L);

        // same hour
        if(end - start < 1 && end -start >0){
            res+=3;
        }else {
            res+=3;
            float diff = (float) (Math.ceil(roundToTwoDecimalPlaces(end - start)) - 1);
            res+= diff * 4;
        }

        // 2 + 3 + (6*4)
        return res;
    }

    public static float roundToTwoDecimalPlaces(float value) {
        return Math.round(value * 100.0f) / 100.0f;
    }
    public static float converStringToFloat(String s){
        String[] timeS = s.split(":");
        return Float.parseFloat(timeS[0]) + (Float.parseFloat(timeS[1])/100);
    }
}
