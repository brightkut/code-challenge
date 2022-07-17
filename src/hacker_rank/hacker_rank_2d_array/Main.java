package hacker_rank.hacker_rank_2d_array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = hourglassSum(arr);

        System.out.println(result);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = 0;

        for (int i =0 ; i< 4; i++){
            for(int j =0 ;j<4; j ++) {
                int row1 = arr.get(i).get(j)+ arr.get(i).get(j+1)+ arr.get(i).get(j+2);
                int row2 = arr.get(i+1).get(j+1);
                int row3 = arr.get(i+2).get(j)+ arr.get(i+2).get(j+1)+ arr.get(i+2).get(j+2);
                int sums = row1+row2+row3;

                if(i==0 && j==0){
                    maxSum = sums;
                }else if(sums>maxSum){
                    maxSum = sums;
                }
            }
        }
        return maxSum;
    }
}
