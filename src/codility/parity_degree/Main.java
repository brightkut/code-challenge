package codility.parity_degree;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(24));

    }

    public static int solution(int N) {
        int res = 0 ;
        int c = 0;

        while(true){
            Double p = Math.pow(2,c);
            if(N % p.intValue() == 0){
                res = c;
            }
            if(p>=N){
                break;
            }
            c++;
        }

        return res;
    }
}
