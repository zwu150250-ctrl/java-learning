import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //定义方法,实现随即生产一个五位数验证码
        //前四位为随即大小写字母,最后一位为数字


        //分析
        //A ~ Z  ,a ~ z
        //方法:在以后,如果我们要在一堆没有什么规律的数据中随机抽出
        //可以先把这些数据放在数组中
        //在随机抽出一个索引

        //1.大写字母,和小写字母随即放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (97 + i);//添加小写字母
            } else {
                chs[i] = (char) (65 + i - 26);//添加大写字母
            }
        }
        //定义一个字符串类型变量,用来记录最终结果
        String result = "";

        //2.随机抽取四次
        Random r = new Random();
        for (int j = 0; j < 4; j++) {
            int randomIndex = r.nextInt(chs.length);
            // System.out.println(chs[randomIndex]);
            result += chs[randomIndex];
        }
        System.out.println(result);


        //3.随机抽取一个数字0~9
        int number = r.nextInt(10); //0~9
        result += number;


        // 最终结果
        System.out.println(result);

    }
}
