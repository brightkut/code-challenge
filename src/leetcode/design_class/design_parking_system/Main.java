package leetcode.design_class.design_parking_system;

public class Main {

    public static void main(String[] args) {
        //["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
        //[[1, 1, 0], [1], [2], [3], [1]]

        ParkingSystem p = new ParkingSystem(1,1,0);
        System.out.println(p.addCar(1));
        System.out.println(p.addCar(2));
        System.out.println(p.addCar(3));
        System.out.println(p.addCar(1));
    }
}
