public class Main {
    public static int[] addNum(int[] array, int num){
        int[] temp = new int[array.length + 1];
        for(int i =0;i< array.length;i++){
            temp[i] = array[i];
        }
        temp[array.length] = num;
        return temp;
    }
    public static int[] pop(int[] array){

    }

    public static int[] delete(int[] array, int index){

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        nums = addNum(nums, 6);
    }
}
