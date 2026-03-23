import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        //抢红包代码优化
        //原因:最后一个抽取出没中的那一个概率为20%,效率低下
        //优化:打乱奖池顺序,遍历奖池

        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
