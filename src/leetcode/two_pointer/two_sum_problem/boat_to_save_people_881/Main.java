package leetcode.two_pointer.two_sum_problem.boat_to_save_people_881;

import java.util.Arrays;

public class Main {

//    Input: people = [1,2], limit = 3
//    Output: 1
//    Explanation: 1 boat (1, 2)
//    Example 2:
//
//    Input: people = [3,2,2,1], limit = 3
//    Output: 3
//    Explanation: 3 boats (1, 2), (2) and (3)
//    Example 3:
//
//    Input: people = [3,5,3,4], limit = 5
//    Output: 4
//    Explanation: 4 boats (3), (3), (4), (5)
    public static void main(String[] args) {
        int [] n1= {1,2};
        int [] n2= {3,2,2,1};
        int [] n3= {3,5,3,4};
        System.out.println(numRescueBoats(n1,3));
        System.out.println(numRescueBoats(n2,3));
        System.out.println(numRescueBoats(n3,5));
    }


//    public static int numRescueBoats(int[] people, int limit) {
//        //1. sort array
//        //2. bring people to boat and we will get remain
//        //3. if numbers of people lower than remain space and be new boat
//        //   - add people(minus remain people) to boat and count the boat
//        //4. if number of people lower than remain space and not new boat
//        // - add people to boat
//        // if number of people equal boat
//        // - add people and count boat
//        // 5. if boat empty set new boat
//        // 6. if no people return number of boat
//
//        int sum = 0;
//
//        Arrays.sort(people);
//
//        for(int p : people) sum+=p;
//
//        int sumPeople = 0;
//        int limitPeople = limit;
//        int numberOfBoats = 0;
//
//        int c = 0;
//        while (sum != sumPeople){
//            int peo = people[c];
//            sumPeople+=peo;
//            if(peo == limitPeople){
//                numberOfBoats++;
//            }else if(peo < limitPeople && limitPeople == limit){
//                limitPeople-=peo;
//                numberOfBoats++;
//            }else if(peo < limitPeople && limitPeople != limit){
//                limitPeople-=peo;
//            }
//            c++;
//        }
//
//        return numberOfBoats;
//    }
    public static int numRescueBoats(int[] people, int limit){
        int l = 0 , r = people.length - 1;
        int sumBoats = 0;

        Arrays.sort(people);

        while (l<=r){
            int sum = people[l] + people[r];
            if(sum <= limit){
                l++;
                r--;
            }else {
                r--;
            }
            sumBoats++;
        }

        return sumBoats;
    }
}
