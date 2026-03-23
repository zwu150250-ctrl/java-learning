import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //双色球彩票系统
        int[] arr = creatNumbe();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
         int[] userInputArr = userInputNumbe();
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }

        //判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length; i++) {
            int redNumber =  userInputArr[i];
            for (int j = 0; j < arr.length; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;
                }

            }
        }
        int blueNumber = userInputArr[userInputArr.length - 1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        System.out.println("红球的个数" + redCount);
        System.out.println("蓝球的个数" + blueCount);

        //根据红球和篮球的个数判断中奖情况
        if(redCount ==6 && blueCount == 1){
            System.out.println("恭喜你,中奖1000万");
        }else if(redCount ==6 && blueCount == 0){
            System.out.println("恭喜你,中奖500万");
        }else if(redCount ==5 && blueCount == 1){
            System.out.println("恭喜你,中奖100万");
        }else if(redCount ==5 && blueCount == 0 ||redCount == 4 && blueCount == 1){
            System.out.println("恭喜你,中奖5000");
        }else if(redCount ==4 && blueCount == 0 ||redCount == 3 && blueCount == 1){
            System.out.println("恭喜你,中奖1000");
        }else if(redCount ==2 && blueCount == 1 ||redCount == 1 && blueCount == 1){
            System.out.println("恭喜你,中奖10");
        }



    }



    //创建一个用户输入彩票号码的方法
    public static int[] userInputNumbe(){
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        //让用户输入红球号码
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入彩票号码");
            int redNumber = sc.nextInt();
           if(redNumber >= 1 && redNumber <= 33){
               Boolean flag= contains(arr,redNumber);
                   if(!flag){
                       arr[i] = redNumber;
                   }else{
                       System.out.println("红球号码已经和存在,请重新输入");
                   }
           }else{
               System.out.println("当前红球号码超出范围");
           }
        }

        //让用户输入蓝球号码
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else{
                System.out.println("请重新输入,当前输入错误");
            }
        }
        return arr;
    }


    //创建一个生成抽奖号码的方法
    public static int[] creatNumbe() {

        //1.创建数组添加中奖号码
        //红球六个,1~33不重复
        //蓝球一个,1~16
        int[] arr = new int[7];

        //2.随机生成中奖号码
        //生成红球号码并添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    //创建一个判断number在数组中是否存在的方法
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }
}

