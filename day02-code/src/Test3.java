public class Test3 {
    public static void main(String[] args) {
        //数字解密
        int[] arr = {8,3,4,6};
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //由于加密是通过对10取余的方式进行
        //所以解密的时候需要判断0~4之间加10,5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <= 4 ){
                arr[i] = arr[i] + 10;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
           number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
