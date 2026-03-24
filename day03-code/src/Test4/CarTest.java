package Test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建三个数组
        Car[] arr = new Car[3];

        //创建汽车对象,数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //录入品牌
            Car c = new Car();//一定要写在内部!!!
            System.out.println("请输入汽车票品牌");
            String brand = sc.next();
            c.setBrand(brand);

            //录入价格
            System.out.println("请输入汽车票价格");
            int prize = sc.nextInt();
            c.setPrize(prize);

            //录入颜色
            System.out.println("请输入汽车颜色");
            String coler = sc.next();
            c.setColer(coler);


            //将汽车对象添加到数组中byd
            arr[i] = c;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getPrize() + ", " +car.getBrand() + "," +car.getColer());

        }
    }
}
