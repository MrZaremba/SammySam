import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<Car> myCars = new ArrayList<>();
        for(int i=0;i<100;i++){
            myCars.add(new Car());
        }
        int num = Integer.parseInt("25");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(34);
        ArrayList<Double> dubs = new ArrayList<>();
        Math.pow(2,2);
        for(Car c : myCars){
            System.out.println(c.carId);
        }
    }
}
