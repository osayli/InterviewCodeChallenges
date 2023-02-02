package leetCode.Easy;

public class EQ1603DesignParkingSystemOther {
    int[] count;
    public EQ1603DesignParkingSystemOther(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }

    public static void main(String[] args) {

    }
}
