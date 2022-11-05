package leetcode.design_class.design_parking_system;

public class ParkingSystem {
    private int [] size;

    public ParkingSystem(int big, int medium, int small) {
        this.size = new int[3];
        size[0] = big;
        size[1] = medium;
        size[2] = small;
    }

    public boolean addCar(int carType) {
        if(size[carType-1] > 0 ) {
            size[carType-1]--;
            return true;
        }
        return false;
    }
}
