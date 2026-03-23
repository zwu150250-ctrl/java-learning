public class Test7 {
    public static void main(String[] args) {
        //二维数组练习
        //求每个季度的中营业额和全年的营业额

        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            yearSum += sum;
        }
        System.out.println(yearSum);

    }

    //定义一个求和数组
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
