package codility.parking_bill;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("10:00","13:21"));
    }

    public static int solution(String E, String L) {
        double start = converStringToDouble(E);
        double end = converStringToDouble(L);
        double diff = Math.ceil(end - start)+1;

        int cost = 0;
        int count =0 ;
        for(int i = 0; i < diff ; i++){
            if(i==0){
                cost+=2;
            }

            if(i==1){
                cost+=3;
            }

            if(i >1){
                count++;
            }
        }
        return cost + (count *4);
    }

    public static double converStringToDouble(String s){
        String[] timeS = s.split(":");
        return Double.parseDouble(timeS[0]) + (Double.parseDouble(timeS[1])/100);
    }
}
