import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Test1 {
    public static void main(String[] args) {
        //数字加密
        //加密规则:先得到每位数,然后每位数加上5,再对10求余,最后将所有数字反转

        //1.把数字里面吗每一位数放到数组中
        int[] arr = {1,9,8,3};

        //2.把每位数字加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        //3.对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        //4.反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //5.拼接
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
           number = number * 10 +  arr[i];

        }
        System.out.println(number);

    }
}
