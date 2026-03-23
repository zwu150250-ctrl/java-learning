import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        //抢红包
        //一个大v直播抽奖,奖池有{2,588,888,1000,10000}五个奖金
        //请使用代码模拟抽奖,奖项的顺序要随即不重复

        //设置一个数组,放置奖池
        int[] arr = {2,588,888,1000,10000};

        //定义一个新数组,储存抽奖结果
        int[] newArr = new int[arr.length];

        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            //判断当前奖项是否存在,不存在,表示有效奖项
            boolean flag = contains(newArr,prize);
            if(!flag){
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("恭喜你,中奖" + newArr[i] + "元");
        }


    }
    //创建一个判断prize是否在数组中的方法,是表示已经抽过了,重新抽取
    //不是表示没有抽到,作为抽奖结果且放入数组中,用于下一次判断
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(prize == arr[i]){
                return true;
            }
        }
        return false;
    }


}
