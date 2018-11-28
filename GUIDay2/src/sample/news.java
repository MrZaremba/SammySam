package sample;

public class news {
    public static void change(int[] nums){
        nums[0] = 10;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        change(nums);
        System.out.println(nums[0]);
    }
}
