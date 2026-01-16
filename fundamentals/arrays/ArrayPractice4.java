public class ArrayPractice4 {
    public static void main(String[] args) {
        //1 of 8
        double[] winners = new double[8];

        //2 of 8
        int[] first_array = {1,3,5,7,11,13,17,19,23,29};

        //3 of 8
        int[] num = new int[20];
        for (int i=0; i < 20; i++){
            num[i] = i*2;
        }

        //4 of 8
        int[][] maze = new int[30][40];

        //5 of 8
        int[][] nums = new int[16][32];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
}
