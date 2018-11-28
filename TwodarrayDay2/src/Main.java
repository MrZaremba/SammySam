public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for(int col=0;col<array.length;col++){
            for(int row=0;row<array[col].length;row++){
                array[col][row] = col + row;
            }
        }
        for(int col=0;col<array.length;col++){
            for(int row=0;row<array[col].length;row++){
                System.out.print(array[col][row] + ", ");
            }
            System.out.println();
        }
    }
}
