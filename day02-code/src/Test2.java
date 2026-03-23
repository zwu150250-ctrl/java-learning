public class Test2 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组中

        //1.得到数组长度
        int number = 12345;
        //定义一个变量临时记录number的值,就是为了第三部的时候再次使用
        //因为number经过while循环以后就为0了,无法再继续使用
        int temp = number;
        int count = 0;
        while (number != 0){
            number = number / 10;
            count ++;
        }

        //2.创建数组
        int[] arr = new int [count];
        //3.把每一位都添加到数组上
        int index = arr.length - 1;
        while(temp != 0){
            //获取temp的每一位
            int ge = temp % 10;
            //去掉最右边的数字
            temp = temp / 10;
            //把当前获取到的数字放到数组中
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
