import java.util.Scanner;

public class Tes11 {
    public static void main(String[] args) {
        //评委打分
        //6个评委打分,去掉最高分,去掉最低分后的4个评委平均分


        //1.定义一个数组,存储六个评委的打分
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }

        //2.找出最高分
        int max = getMax(scoreArr);

        //3.找出最低分
        int min = getMin(scoreArr);

        //4.求和
        int sum = getSum(scoreArr);

        //5.求平均值
        int averge = (sum - max - min)/(scoreArr.length - 2);
        System.out.println("最终分数为"+averge);

    }






    //定义一个获取最大值的方法
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }

    //定义一个获取最小值的方法
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }

    //定义一个求和方法
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum ;
    }


    //定义一个,获取评委打分的方法
    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委打分");
            int score = sc.nextInt();
            if(score>=0 && score<=100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("成绩超出范围,当前i为"+i);
            }

        }
      return scores;
    }

}
